package dat18c.airport_app.db.interfaces;

import java.sql.Connection;

/**
 * IDatabaseConnection
 */
public interface IDatabaseConnection 
{
    boolean connect();
    Connection getConnection();
    void disconnect();    
}