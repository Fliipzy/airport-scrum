package dat18c.airport_app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dat18c.airport_app.db.interfaces.IDatabaseConnection;

/**
 * DatabaseConnection
 */
public class DatabaseConnection implements IDatabaseConnection
{
    private Connection connection = null;
    private boolean isConnected = false;

    private static DatabaseConnection instance = null;

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance()
    {
        if (instance == null) 
        {
            instance = new DatabaseConnection();   
        }
        return instance;
    }

    @Override
    public boolean connect() 
    {
        if(!isConnected)
        {
            if(connection == null)
            {
                try 
                {
                    connection = DriverManager.getConnection("jdbc:mysql//den1.mysql6.gear.host:3306/lufthavn", "lufthavn", "dat18c!");
                    isConnected = true;
                    return true;
                }
                catch (SQLException e) 
                {
                    System.out.println("Something went wrong trying to connect to the database!");
                    return false;
                }
            }

        }
        return true;
    }

    @Override
    public void disconnect() 
    {
        try 
        {
            connection.close();
        } 
        catch (SQLException e) 
        {
            System.out.println(e.toString());
        }
    }

    @Override
    public Connection getConnection() 
    {
        return connection;
    }
}