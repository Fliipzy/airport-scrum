package dat18c.airport_app.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.AirportServiceCompany;
import dat18c.airport_app.repositories.interfaces.ICrud;


public class AirportServiceCompanyRepository implements ICrud<AirportServiceCompany> 
{
    private Connection connection;

    public AirportServiceCompanyRepository(IDatabaseConnection databaseConnection) 
    {
        this.connection = databaseConnection.getConnection();
    }

    public List<AirportServiceCompany> fetchAll() throws SQLException
    {
        List<AirportServiceCompany> serviceSelskaber = new ArrayList<AirportServiceCompany>();
       
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
    public AirportServiceCompany findById(int id) throws SQLException
    {
        return null;
    }

    @Override
    public void update(AirportServiceCompany o) throws SQLException
    {

    }

    @Override
    public void create(AirportServiceCompany o) throws SQLException
    {

    }

    @Override
    public void deleteById(int id) throws SQLException
    {

    }

    private AirportServiceCompany mapToServiceSelskab(ResultSet resultSet) throws SQLException
    {
        return null;
    }
}
