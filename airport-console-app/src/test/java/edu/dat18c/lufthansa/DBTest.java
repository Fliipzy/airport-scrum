package edu.dat18c.lufthansa;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;

/**
 * DBTest
 */
public class DBTest 
{
    @Test
    public void TestDBConnection()
    {
        System.out.println("test");
        IDatabaseConnection dbConnection = DatabaseConnection.getInstance();

        assertTrue(dbConnection.connect());

    }    
}