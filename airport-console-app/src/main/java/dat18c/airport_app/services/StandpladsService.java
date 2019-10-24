package dat18c.airport_app.services;



import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.AirplaneParkingSpot;
import dat18c.airport_app.repositories.AirplaneParkingSpotRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class StandpladsService
{
    Scanner scan;
    private Connection connection;

    public StandpladsService(IDatabaseConnection databaseConnection){
        this.connection = databaseConnection.getConnection();
    }

    public void movePlane() throws SQLException {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();


        scan = new Scanner(System.in);

        String sql = "UPDATE standplads SET available=? WHERE standpladsNummer=?";

        PreparedStatement statement = connection.prepareStatement(sql);
        System.out.print("Vælg hvilken standplads du vil ændre: ");
        statement.setInt(2, scan.nextInt());
        System.out.print("Skriv tilstand: ");
        statement.setInt(1, scan.nextInt());

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Fly Tilstand opdateret!");
        }
    }
}
