package dat18c.airport_app.utils;

import dat18c.airport_app.utils.interfaces.ICommand;

/**
 * FuelCommand
 */
public class FuelCommand implements ICommand 
{
    @Override
    public void execute() 
    {
        System.out.println("Done fueling the airplane!");
    }
}