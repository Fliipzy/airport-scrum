package dat18c.airport_app.utils;

import dat18c.airport_app.utils.interfaces.ICommand;

/**
 * CleaningCommand
 */
public class CleaningCommand implements ICommand
{
    @Override
    public void execute() 
    {
        System.out.println("Done cleaning the airplane!");
    }   
}