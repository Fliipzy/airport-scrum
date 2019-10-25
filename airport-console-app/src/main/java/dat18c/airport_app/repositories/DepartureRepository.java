package dat18c.airport_app.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.Airline;
import dat18c.airport_app.models.Airplane;
import dat18c.airport_app.models.Departure;
import dat18c.airport_app.models.enums.Size;
import dat18c.airport_app.repositories.interfaces.ICrud;

/** DepartureRepository */
public class DepartureRepository implements ICrud<Departure, Integer> 
{
    private Connection connection;

    //Constructor
    public DepartureRepository(IDatabaseConnection dbConnection)
    {
        this.connection = dbConnection.getConnection();
    }

    //CRUD metoder fra ICrud interface
    //Oversigt over Fly og Departure time
    @Override
    public List<Departure> fetchAll() throws SQLException 
    {
        List<Departure> departures = new ArrayList<Departure>();

        String query = "SELECT fly_navn, fra_land, ankomst_tidspunkt," +
                " fly.flyselskab_navn, fly.størrelse FROM lufthavn.destination" +
                " INNER JOIN lufthavn.fly ON fly_navn = lufthavn.fly.navn";

        //Tager imod query statement
        var statement = connection.createStatement();
        //Udfører query
        var rSet = statement.executeQuery(query);

        while (rSet.next()) 
        {
            departures.add(mapToDeparture(rSet));
        }

        statement.close();
        rSet.close();
        return departures;
    }

    @Override
    public Departure findById(Integer id) throws SQLException 
    {
        return null;
    }

    @Override
    public void update(Departure departure) throws SQLException 
    {
    }

    @Override
    public void create(Departure departure) throws SQLException 
    {
    }

    @Override
    public void deleteById(Integer id) throws SQLException 
    {
    }

    private Departure mapToDeparture(ResultSet rSet) throws SQLException 
    {
        String airplaneName = rSet.getString("fly_navn");
        String toCountry = rSet.getString("fra_land");
        Date departureTime = rSet.getDate("ankomst_tidspunkt");
        String airlineCompanyName = rSet.getString("flyselskab_navn");
        Size airplaneSize = Size.fromInt((rSet.getInt("størrelse")));

        var airplane = new Airplane(airplaneName, airplaneSize, new Airline(airlineCompanyName));
        var departure = new Departure(airplane, toCountry, departureTime);

        return departure;
    }
}
