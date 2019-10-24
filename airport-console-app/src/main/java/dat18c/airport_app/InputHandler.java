package dat18c.airport_app;

import java.io.IOException;

/**
 * InputHandler
 */
public final class InputHandler 
{
    public static int getInt()
    {
        while (true) 
        {
            try 
            {
                return Integer.parseInt(getString());    
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Could not parse to int!");
            }
        }
    }

    public static float getFloat()
    {
        while (true) 
        {
            try 
            {
                return Float.parseFloat(getString());    
            } 
            catch (Exception e) 
            {
                System.out.println("Could not parse to float!");
            }
        }
    }

    public static double getDouble()
    {
        while (true) 
        {
            try 
            {
                return Double.parseDouble(getString());    
            } 
            catch (Exception e) 
            {
                System.out.println("Could not parse to double!");
            }
        }
    }

    public static String getString()
    {
        return System.console().readLine();
    }

    public static void waitForKeyPress(String promptMessage)
    {
        System.out.println(promptMessage);

        try 
        {
            System.in.read();
        } 
        catch (IOException e) 
        {
        }
    }
    public static void waitForKeyPress()
    {
        try 
        {
            System.in.read();
        } 
        catch (IOException e) 
        {
        }
    }
}