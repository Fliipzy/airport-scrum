package dat18c.airport_app.repositories;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.model.ServiceSelskab;
import dat18c.airport_app.service.ICrud;

import java.sql.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;


public class ServiceSelskabRepo implements ICrud<ServiceSelskab>
{


    private Connection conn;


    public ServiceSelskabRepo(IDatabaseConnection databaseConnection)
    {
        this.conn = databaseConnection.getConnection();
    }

    public void showServiceSelskab()
    {
        try
        {
            var dbConnection = DatabaseConnection.getInstance();
            dbConnection.connect();
            var statement = dbConnection.getConnection().createStatement();
            var resultSet = statement.executeQuery("SELECT * FROM serviceselskab");



            while (resultSet.next())
            {
                for (int i = 0; i < 13 ; i++)
                {
                    System.out.print(resultSet.getString(2 + i)+ " ");
                }


            }
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            //TODO: handle exception
        }
    }



    @Override
    public List<ServiceSelskab> fetchAll()
    {
       /* List<ServiceSelskab> serviceList = new ArrayList<>();


        try {
            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM serviceselskab");

            if(statement.execute("SELECT * FROM serviceselskab"))
            {
                resultSet = statement.getResultSet();
            }

            serviceList.add(resultSet);



        } catch (SQLException e) {
            e.printStackTrace();
        }return serviceList;*/
       return null;
    }

    @Override
    public ServiceSelskab findById(int id)
    {

        return null;


    }

    @Override
    public void update(ServiceSelskab o) {

    }

    @Override
    public void addItem(ServiceSelskab o) {

    }

    @Override
    public void deleteById(int id) {

    }
}
