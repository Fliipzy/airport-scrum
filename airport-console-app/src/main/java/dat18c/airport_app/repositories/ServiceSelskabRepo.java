package dat18c.airport_app.repositories;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.model.ServiceSelskab;
import dat18c.airport_app.service.ICrud;

import java.sql.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ServiceSelskabRepo implements ICrud<ServiceSelskab>
{
    static Scanner input;


    private Connection conn;


    public ServiceSelskabRepo(IDatabaseConnection databaseConnection)
    {
        this.conn = databaseConnection.getConnection();
    }



    @Override
    public void showAll()
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

    public void insert()
    {

        input = new Scanner(System.in);
        String sql = "INSERT INTO serviceselskab(idServiceSelskab, size, Taxi_ind_ved_ankomst, Passagerer_ud," +
                "Bagage_ud, Brændstof_påfyldning, Rengøring, Bagage_ind, Passagerer_ind, Taxi_ud_til_afgang," +
                "Taxi_til_og_fra_ventepladser, Personale_til_og_fra_naboplads, Personale_til_og_fra_øvrige_i_egen_terminal," +
                "Personale_til_og_fra_den_anden_terminal ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, input.nextInt());
            statement.setString(2, input.next());
            statement.setInt(3, input.nextInt());
            statement.setInt(4, input.nextInt());
            statement.setInt(5, input.nextInt());
            statement.setInt(6, input.nextInt());
            statement.setInt(7, input.nextInt());
            statement.setInt(8, input.nextInt());
            statement.setInt(9, input.nextInt());
            statement.setInt(10, input.nextInt());
            statement.setInt(11, input.nextInt());
            statement.setInt(12, input.nextInt());
            statement.setInt(13, input.nextInt());
            statement.setInt(14, input.nextInt());

            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0 )
            {
                System.out.println("Info added");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    @Override
    public ServiceSelskab findById(int id)
    {
        return null;

    }

    @Override
    public void update(ServiceSelskab o)
    {


    }

    @Override
    public void addItem(ServiceSelskab o)
    {


    }

    @Override
    public void deleteById(int id) {

    }
}
