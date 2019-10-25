package dat18c.airport_app.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.Airline;
import dat18c.airport_app.repositories.interfaces.ICrud;

public class AirlineRepository implements ICrud<Airline, String> 
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
            //airLineInfo.add(new Airline(resultSet.getString(1)));
            airLineInfo.add(maptoairline(resultSet));
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
    public Airline findById(String id) throws SQLException 
    {
        return null;
    }

    @Override
    public void deleteById(String id) throws SQLException 
    {

    }

    public void deleteairLineInfo() throws SQLException
    {
        try {


            input = new Scanner(System.in);
            String sql = "DELETE FROM flyselskab WHERE navn=?";

            System.out.println("Please delete Airline Company - Chose the name of the Airline");

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, input.nextLine());

            int rowDeleted = statement.executeUpdate();

            if (rowDeleted > 0) {
                System.out.println("Airline deleted");
            }

        }catch (InputMismatchException e){
            System.out.println("invalid input - try again!");
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

        String sql = "UPDATE flyselskab SET navn=? where navn=?";

        try
        {

            System.out.println("Please chose the Airline you want to update");
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(2,input.nextLine());
            System.out.println("type new name");
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


    private Airline maptoairline(ResultSet resultSet) throws SQLException{

        String name = resultSet.getString("navn");

        return new Airline(name);

    }
   /* private AirplaneParkingSpot mapToAirplaneParkingSpot(ResultSet resultSet) throws SQLException
    {
        int number = resultSet.getInt("standpladsNummer");
        Size size = Size.fromInt(resultSet.getInt("størrelse"));
        boolean available = resultSet.getBoolean("available");

        return new AirplaneParkingSpot(size, number, (available) ? new Airplane() : null);
    }
    */

}
