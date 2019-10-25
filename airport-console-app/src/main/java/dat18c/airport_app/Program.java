package dat18c.airport_app;

import java.sql.SQLException;
import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.Airline;
import dat18c.airport_app.models.Airplane;
import dat18c.airport_app.models.enums.Size;
import dat18c.airport_app.repositories.AirplaneRepository;
import dat18c.airport_app.services.Menu;
import dat18c.airport_app.userconfig.UserConfig;

/**
 * Hello world!
 */
public class Program 
{
    public static void main(String[] args) throws SQLException 
    {
        UserConfig.StartConfiguration();
        
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        Menu menu = new Menu();

        menu.printMenu();
    }
}
