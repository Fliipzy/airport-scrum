package dat18c.airport_app.repositories;

import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.Airline;
import dat18c.airport_app.repositories.interfaces.ICrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirlineRepository implements ICrud<Airline> 
{
    private Connection connection;
    static Scanner input;

    public AirlineRepository(IDatabaseConnection databaseConnection)
    {
        this.connection = databaseConnection.getConnection();
    }

    @Override
    public List<Airline> fetchAll() throws SQLException 
    {
        List<Airline> airLineInfo = new ArrayList<Airline>();

        var statement = connection.createStatement();
        var resultSet = statement.executeQuery("SELECT * from flyselskab");

        while (resultSet.next())
        {
            airLineInfo.add(new Airline(resultSet.getString(1)));
        }

        statement.close();
        resultSet.close();
        return airLineInfo;
    }

    @Override
    public void update(Airline airline) throws SQLException 
    {

    }

    @Override
    public void create(Airline airline) throws SQLException 
    {

    }

    @Override
    public Airline findById(int id) throws SQLException 
    {
        return null;
    }

    @Override
    public void deleteById(int id) throws SQLException 
    {

    }

    public void deleteairLineInfo() throws SQLException
    {
        input = new Scanner(System.in);
        String sql = "DELETE FROM flyselskab WHERE navn=?";

        System.out.println("Please delete Airline Company");

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,input.nextLine());

        int rowDeleted = statement.executeUpdate();

        if (rowDeleted > 0)
        {
            System.out.println("Airline deleted");
        }

    }

    public void create()
    {
        input = new Scanner(System.in);
        String sql = "INSERT INTO flyselskab(navn) VALUES(?)";

        try 
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            System.out.println("navn: ");
            statement.setString(1,input.nextLine());

            int rowInserted = statement.executeUpdate();
            if (rowInserted > 0)
            {
                System.out.println("Airline Info added");
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("Cant create this Air line... check line 74");
        }
    }

    public void updateAirlineTable()
    {
        input = new Scanner(System.in);

        String sql = "UPDATE flyselskab SET navn=?";

        try 
        {

            System.out.println("Please chose the Airline you want to update");
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,input.nextLine());



            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0)
            {
                System.out.println("An existing Airline has been updated");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("Airline not update check line 93");
        }
    }

}
