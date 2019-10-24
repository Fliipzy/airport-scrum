package dat18c.airport_app.userconfig;

import dat18c.airport_app.userconfig.enums.OperatingSystem;

/**
 * UserConfig
 */
public final class UserConfig 
{
    private static OperatingSystem operatingSystem;
    private static String userName;

    private UserConfig(){}

    public static void StartConfiguration()
    {
        userName = System.getProperty("user.name");
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) 
        {
            operatingSystem = OperatingSystem.WINDOWS;
        }
        else
        {
            operatingSystem = OperatingSystem.OTHER;
        }
    } 

    public static OperatingSystem getOperationSystem()
    {
        return operatingSystem;
    }

    public static String getUserName()
    {
        return userName;
    }
}