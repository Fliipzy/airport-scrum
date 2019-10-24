package dat18c.airport_app.utils;

import dat18c.airport_app.utils.interfaces.ICommand;

/**
 * Timer
 */
public class Timer extends Thread 
{
    private long sleepInterval;
    private ICommand command;
    private boolean loop;
    private boolean continueRunning = true;

    public Timer(long sleepInterval, ICommand command, boolean loop) 
    {
        this.sleepInterval = sleepInterval;
        this.command = command;
        this.loop = loop;
    }

    @Override
    public void run()
    {
        if (loop) 
        {
            while(continueRunning)
            {
                try 
                {
                    Thread.sleep(sleepInterval);
                    command.execute();
                } 
                catch (Exception e) 
                {
                }
            }
        }
        else
        {
            try 
            {
                Thread.sleep(sleepInterval);
                command.execute();
            } 
            catch (Exception e) 
            {
            }
        }

    }

    public void stopTimer()
    {
        continueRunning = false;
    }
}