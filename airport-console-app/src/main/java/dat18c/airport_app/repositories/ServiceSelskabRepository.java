package dat18c.airport_app.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.ServiceSelskab;
import dat18c.airport_app.repositories.interfaces.ICrud;


public class ServiceSelskabRepository implements ICrud<ServiceSelskab> 
{
    private Connection connection;

    public ServiceSelskabRepository(IDatabaseConnection databaseConnection) 
    {
        this.connection = databaseConnection.getConnection();
    }

    public List<ServiceSelskab> fetchAll() throws SQLException
    {
        List<ServiceSelskab> serviceSelskaber = new ArrayList<ServiceSelskab>();
       
        var statement = connection.createStatement();
        var resultSet = statement.executeQuery("SELECT * FROM serviceselskab");

        while (resultSet.next()) 
        {
            serviceSelskaber.add(mapToServiceSelskab(resultSet));    
        }
        
        statement.close();
        resultSet.close();
        return serviceSelskaber;
    }

    @Override
    public ServiceSelskab findById(int id) throws SQLException
    {
        return null;
    }

    @Override
    public void update(ServiceSelskab o) throws SQLException
    {

    }

    @Override
    public void create(ServiceSelskab o) throws SQLException
    {

    }

    @Override
    public void deleteById(int id) throws SQLException
    {

    }

    private ServiceSelskab mapToServiceSelskab(ResultSet resultSet) throws SQLException
    {
        return null;
    }
}
