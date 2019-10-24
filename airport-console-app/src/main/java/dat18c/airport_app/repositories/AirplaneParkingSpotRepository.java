package dat18c.airport_app.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.AirplaneParkingSpot;
import dat18c.airport_app.models.enums.Size;
import dat18c.airport_app.repositories.interfaces.ICrud;

/**
 * AirplaneParkingSpotRepository
 */
public class AirplaneParkingSpotRepository implements ICrud<AirplaneParkingSpot> 
{
    private Connection connection;

    public AirplaneParkingSpotRepository(IDatabaseConnection dbConnection) 
    {
        this.connection = dbConnection.getConnection();
    }

    @Override
    public List<AirplaneParkingSpot> fetchAll() throws SQLException 
    {
        List<AirplaneParkingSpot> parkingSpots = new ArrayList<AirplaneParkingSpot>();

        var statement = connection.createStatement();
        var resultSet = statement.executeQuery("SELECT * FROM standplads");

        while (resultSet.next()) 
        {
            parkingSpots.add(mapToAirplaneParkingSpot(resultSet));
        }

        statement.close();
        resultSet.close();
        return parkingSpots;
    }

    @Override
    public AirplaneParkingSpot findById(int id) throws SQLException 
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(AirplaneParkingSpot t) throws SQLException 
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void create(AirplaneParkingSpot t) throws SQLException 
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteById(int id) throws SQLException 
    {
        // TODO Auto-generated method stub

    }

    private AirplaneParkingSpot mapToAirplaneParkingSpot(ResultSet resultSet) throws SQLException
    {
        int number = resultSet.getInt("standpladsNummer");
        Size size = Size.fromInt(resultSet.getInt("størrelse"));
        boolean available = resultSet.getBoolean("available");

        return new AirplaneParkingSpot(size, number ,null, available);
    }
}