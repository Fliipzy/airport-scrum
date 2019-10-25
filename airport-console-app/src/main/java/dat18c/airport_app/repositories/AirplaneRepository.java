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
import dat18c.airport_app.models.Airplane;
import dat18c.airport_app.models.enums.Size;
import dat18c.airport_app.repositories.interfaces.ICrud;

public class AirplaneRepository implements ICrud<Airplane, String>
{
    private Connection connection;
    static Scanner input;

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
    public Airplane findById(String id) throws SQLException
    {
        return null;
    }

    @Override
    public void update(Airplane t) throws SQLException
    {
        var preparedStatement = connection.prepareStatement("UPDATE fly SET flyselskab_navn=?, størrelse=? WHERE navn=?");
        preparedStatement.setString(3, t.getName());
        preparedStatement.setString(1, t.getAirline().getName());
        preparedStatement.setInt(2, t.getSize().ordinal()+1);

        preparedStatement.executeUpdate();
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
    public void deleteById(String id) throws SQLException
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

    public void deleteAirplaneInfo() throws SQLException
    {
        try {

            input = new Scanner(System.in);
            String sql = "DELETE FROM fly WHERE navn=?";

            System.out.println("Choose an Airplane to delete: ");

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, input.nextLine());

            int rowDeleted = statement.executeUpdate();

            if (rowDeleted > 0) {
                System.out.println("Airplane deleted");
            }

        }catch (InputMismatchException e){
            System.out.println("invalid input - try again!");
        }

    }
}
