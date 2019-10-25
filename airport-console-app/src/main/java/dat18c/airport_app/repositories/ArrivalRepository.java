package dat18c.airport_app.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.Airline;
import dat18c.airport_app.models.Airplane;
import dat18c.airport_app.models.Arrival;
import dat18c.airport_app.models.enums.Size;
import dat18c.airport_app.repositories.interfaces.ICrud;

/**
 * ArrivalRepository used to fetch data regarding the arrival of a plane.
 */
public class ArrivalRepository implements ICrud<Arrival, Integer> 
{
    private Connection connection;

    //Establishes DB connection
    public ArrivalRepository(IDatabaseConnection databaseConnection) 
    {
        this.connection = databaseConnection.getConnection();
    }

    //Method that retrieves a list of plane name, to country, departure time, airline and size.
    @Override
    public List<Arrival> fetchAll() throws SQLException 
    {
        List<Arrival> arrivals = new ArrayList<Arrival>();

        String sql = "SELECT fly_navn, til_land, afgang_tidspunkt," + 
        " fly.flyselskab_navn, fly.størrelse FROM lufthavn.afgang " + 
        " INNER JOIN lufthavn.fly ON fly_navn = lufthavn.fly.navn";

        //Accepts and executes SQL queries
        var statement = connection.createStatement();
        var resultSet = statement.executeQuery(sql);

        //Runs as long as there is something to read in the resultset
        while (resultSet.next()) 
        {
            arrivals.add(mapToArrival(resultSet));
        }
        statement.close();
        resultSet.close();
        return arrivals;
    }

    @Override
    public Arrival findById(Integer id) throws SQLException 
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(Arrival t) throws SQLException 
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void create(Arrival t) throws SQLException 
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteById(Integer id) throws SQLException 
    {
        // TODO Auto-generated method stub

    }

    //Gives "Arrival" the values of name, to coutnry, timestamp, airline name and size.
    private Arrival mapToArrival(ResultSet resultSet) throws SQLException
    {
        String airplaneName = resultSet.getString("fly_navn");
        String fromCountry = resultSet.getString("til_land");
        Date arrivalDate = resultSet.getDate("afgang_tidspunkt");
        Time arrivalTime = resultSet.getTime("afgang_tidspunkt");
        String airlineCompanyName = resultSet.getString("flyselskab_navn");
        Size airplaneSize = Size.fromInt(resultSet.getInt("størrelse"));

        Airplane airplane = new Airplane(airplaneName, airplaneSize, new Airline(airlineCompanyName));
        Arrival arrival = new Arrival(airplane, fromCountry, arrivalDate, arrivalTime);

        return arrival;
    }
}