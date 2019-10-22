package dat18c.airport_app.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.Airline;
import dat18c.airport_app.models.Plane;
import dat18c.airport_app.models.enums.PlaneSize;
import dat18c.airport_app.repositories.interfaces.ICrud;

public class PlaneRepository implements ICrud<Plane>
{
    private Connection connection;

    public PlaneRepository(IDatabaseConnection dbConnection) 
    {
        this.connection = dbConnection.getConnection();
    }

    @Override
    public List<Plane> fetchAll() throws SQLException
    {
        List<Plane> planes = new ArrayList<Plane>();

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
    public Plane findById(int id) throws SQLException
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(Plane t) throws SQLException
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void create(Plane t) throws SQLException
    {
        var sql = String.format(
            "INSERT INTO fly (navn, flyselskab_navn, størrelse) VALUES ('%s', '%s', %s)",
            t.getName(), t.getFlySelskab().getName(), t.getSize().ordinal());

        var statement = connection.createStatement();
        statement.executeUpdate(sql);

        statement.close();
    }

    @Override
    public void deleteById(int id) throws SQLException
    {
        // TODO Auto-generated method stub
    }

    private Plane mapToPlane(ResultSet resultSet) throws SQLException
    {
        String name = resultSet.getString("navn");
        PlaneSize size = PlaneSize.fromInt(resultSet.getInt("størrelse"));
        Airline airline = new Airline(resultSet.getString("flyselskab_navn"));

        return new Plane(name, size, airline);
    }
}
