package dat18c.airport_app.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
 * ArrivalRepository
 */
public class ArrivalRepository implements ICrud<Arrival> 
{
    private Connection connection;

    public ArrivalRepository(IDatabaseConnection databaseConnection) 
    {
        this.connection = databaseConnection.getConnection();
    }

    @Override
    public List<Arrival> fetchAll() throws SQLException 
    {
        List<Arrival> arrivals = new ArrayList<Arrival>();

        String sql = "SELECT fly_navn, til_land, afgang_tidspunkt," + 
        " fly.flyselskab_navn, fly.størrelse FROM lufthavn.afgang " + 
        " INNER JOIN lufthavn.fly ON fly_navn = lufthavn.fly.navn";

        var statement = connection.createStatement();
        var resultSet = statement.executeQuery(sql);

        while (resultSet.next()) 
        {
            arrivals.add(mapToArrival(resultSet));
        }

        statement.close();
        resultSet.close();
        return arrivals;
    }

    @Override
    public Arrival findById(int id) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(Arrival t) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void create(Arrival t) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteById(int id) throws SQLException {
        // TODO Auto-generated method stub

    }

    private Arrival mapToArrival(ResultSet resultSet) throws SQLException
    {
        String airplaneName = resultSet.getString("fly_navn");
        String fromCountry = resultSet.getString("til_land");
        Date arrivalTime = resultSet.getDate("afgang_tidspunkt");
        String airlineCompanyName = resultSet.getString("flyselskab_navn");
        Size airplaneSize = Size.fromInt(resultSet.getInt("størrelse"));

        Airplane airplane = new Airplane(airplaneName, airplaneSize, new Airline(airlineCompanyName));
        Arrival arrival = new Arrival(airplane, fromCountry, arrivalTime);

        return arrival;
    }
}