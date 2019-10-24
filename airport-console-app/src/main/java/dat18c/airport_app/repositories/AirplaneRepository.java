package dat18c.airport_app.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.Airline;
import dat18c.airport_app.models.Airplane;
import dat18c.airport_app.models.enums.Size;
import dat18c.airport_app.repositories.interfaces.ICrud;

public class AirplaneRepository implements ICrud<Airplane>
{
    private Connection connection;

    public AirplaneRepository(IDatabaseConnection dbConnection) 
    {
        this.connection = dbConnection.getConnection();
    }

    @Override
    public List<Airplane> fetchAll() throws SQLException
    {
        List<Airplane> planes = new ArrayList<Airplane>();

        var statement = connection.createStatement();
        var resultSet = statement.executeQuery("SELECT * FROM fly");

        while (resultSet.next()) 
        {
            planes.add(mapToPlane(resultSet)); 
        }
        
        statement.close();
        resultSet.close();
        return planes;
    }

    @Override
    public Airplane findById(int id) throws SQLException
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(Airplane t) throws SQLException
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void create(Airplane t) throws SQLException
    {
        var sql = String.format(
            "INSERT INTO fly (navn, flyselskab_navn, størrelse) VALUES ('%s', '%s', %s)",
            t.getName(), t.getAirline().getName(), t.getSize().ordinal());

        var statement = connection.createStatement();
        statement.executeUpdate(sql);

        statement.close();
    }

    @Override
    public void deleteById(int id) throws SQLException
    {
        // TODO Auto-generated method stub
    }

    private Airplane mapToPlane(ResultSet resultSet) throws SQLException
    {
        String name = resultSet.getString("navn");
        Size size = Size.fromInt(resultSet.getInt("størrelse"));
        Airline airline = new Airline(resultSet.getString("flyselskab_navn"));

        return new Airplane(name, size, airline);
    }
}
