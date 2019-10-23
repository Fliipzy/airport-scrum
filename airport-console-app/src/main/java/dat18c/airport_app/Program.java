package dat18c.airport_app;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.repositories.AirportServiceCompanyRepository;

import java.sql.SQLException;

/**
 * Hello world!
 */
public class Program 
{
    public static void main(String[] args) throws SQLException {
        IDatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        AirportServiceCompanyRepository airportService = new AirportServiceCompanyRepository(dbConnection);

        airportService.insert();

    }
}
