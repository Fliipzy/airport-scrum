package dat18c.airport_app;

import dat18c.airport_app.userconfig.UserConfig;
import dat18c.airport_app.utils.Timer;
import dat18c.airport_app.utils.interfaces.ICommand;

/**
 * Hello world!
 */
public class Program 
{
    public static void main(String[] args) 
    {
        UserConfig.StartConfiguration();
        System.out.println(UserConfig.getUserName());

        ICommand command = new ICommand(){
        
            @Override
            public void execute() 
            {
                System.out.println("Hello, World!");
            }
        };

        Timer timer = new Timer(1000, command, true);
        timer.start();

        try 
        {
            Thread.sleep(3000);
            timer.interrupt();    
        } 
        catch (Exception e) 
        {
            //TODO: handle exception
        }


    }

    private static void promptMenu()
    {
        
    }
}
