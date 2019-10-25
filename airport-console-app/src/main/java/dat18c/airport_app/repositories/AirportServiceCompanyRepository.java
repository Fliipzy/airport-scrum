package dat18c.airport_app.repositories;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.AirportServiceCompany;
import dat18c.airport_app.models.enums.Size;
import dat18c.airport_app.repositories.interfaces.ICrud;


public class AirportServiceCompanyRepository implements ICrud<AirportServiceCompany, Integer> 
{
    private Connection connection;
    static Scanner input;

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
    public AirportServiceCompany findById(Integer id) throws SQLException
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
    public void deleteById(Integer id) throws SQLException 
    {
        
    }

    public void deleteServiceSelskab() throws SQLException 
    {
        input = new Scanner(System.in);
        String sql = "DELETE FROM serviceselskab WHERE idServiceSelskab=?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, input.next());

        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) 
        {
            System.out.println("ServiceSelskab deleted");
        }

    }

    
    // Denne metode lavet en insert i serviceselskab tabel.
    public void insert() 
    {    
        input = new Scanner(System.in);
        String sql =
        "INSERT INTO serviceselskab(idServiceSelskab, size, Taxi_ind_ved_ankomst, Passagerer_ud,"
        + "Bagage_ud, Brændstof_påfyldning, Rengøring, Bagage_ind, Passagerer_ind, Taxi_ud_til_afgang,"
        + "Taxi_til_og_fra_ventepladser, Personale_til_og_fra_naboplads, Personale_til_og_fra_øvrige_i_egen_terminal,"
        + "Personale_til_og_fra_den_anden_terminal ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            System.out.print("Skriv Id: ");
            statement.setInt(1, input.nextInt());
            System.out.print("Skriv Size: ");
            statement.setString(2, input.next());
            System.out.print("Skriv Taxi ind ved ankomst: ");
            statement.setInt(3, input.nextInt());
            System.out.print("Skriv Passagerer ud");
            statement.setInt(4, input.nextInt());
            System.out.print("Skriv Bagage ud");
            statement.setInt(5, input.nextInt());
            System.out.print("Skriv Brændstof påfyldning");
            statement.setInt(6, input.nextInt());
            System.out.print("Skriv Rengøring");
            statement.setInt(7, input.nextInt());
            System.out.print("Skriv Bagage ind");
            statement.setInt(8, input.nextInt());
            System.out.print("Skriv Passagerer ind");
            statement.setInt(9, input.nextInt());
            System.out.print("Skriv Taxi ud til afgang");
            statement.setInt(10, input.nextInt());
            System.out.print("Skriv Taxi til og fra ventepladser");
            statement.setInt(11, input.nextInt());
            System.out.print("Skriv Personale_til_og_fra_naboplads");
            statement.setInt(12, input.nextInt());
            System.out.print("Skriv Personale_til_og_fra_øvrige_i_egen_terminal");
            statement.setInt(13, input.nextInt());
            System.out.print("Skriv Personale_til_og_fra_den_anden_terminal");
            statement.setInt(14, input.nextInt());
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) 
            {
                System.out.println("Info added");
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    public void updateServiceTable() 
    {    
        input = new Scanner(System.in);
        
        String sql =
        "UPDATE serviceselskab SET idServiceSelskab=?, size=?, Taxi_ind_ved_ankomst=?, Passagerer_ud=?,"
        + "Bagage_ud=?, Brændstof_påfyldning=?, Rengøring=?, Bagage_ind=?, Passagerer_ind=?, Taxi_ud_til_afgang=?,"
        + "Taxi_til_og_fra_ventepladser=?, Personale_til_og_fra_naboplads=?, Personale_til_og_fra_øvrige_i_egen_terminal=?,"
        + "Personale_til_og_fra_den_anden_terminal=?";
        
        try 
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            System.out.print("Skriv Id: ");
            statement.setInt(1, input.nextInt());
            System.out.print("Skriv Size: ");
            statement.setString(2, input.next());
            System.out.print("Skriv Taxi ind ved ankomst: ");
            statement.setInt(3, input.nextInt());
            System.out.print("Skriv Passagerer ud");
            statement.setInt(4, input.nextInt());
            System.out.print("Skriv Bagage ud");
            statement.setInt(5, input.nextInt());
            System.out.print("Skriv Brændstof påfyldning");
            statement.setInt(6, input.nextInt());
            System.out.print("Skriv Rengøring");
            statement.setInt(7, input.nextInt());
            System.out.print("Skriv Bagage ind");
            statement.setInt(8, input.nextInt());
            System.out.print("Skriv Passagerer ind");
            statement.setInt(9, input.nextInt());
            System.out.print("Skriv Taxi ud til afgang");
            statement.setInt(10, input.nextInt());
            System.out.print("Skriv Taxi til og fra ventepladser");
            statement.setInt(11, input.nextInt());
            System.out.print("Skriv Personale_til_og_fra_naboplads");
            statement.setInt(12, input.nextInt());
            System.out.print("Skriv Personale_til_og_fra_øvrige_i_egen_terminal");
            statement.setInt(13, input.nextInt());
            System.out.print("Skriv Personale_til_og_fra_den_anden_terminal");
            statement.setInt(14, input.nextInt());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing user was updated successfully!");
            }
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        
    }

    private AirportServiceCompany mapToServiceSelskab(ResultSet resultSet) throws SQLException 
    {
        int id = resultSet.getInt("idServiceSelskab");
        Size size = Size.fromInt(resultSet.getInt("size"));
        int taxiIn_time = resultSet.getInt("Taxi_ind_ved_ankomst");
        int passengerOut_time = resultSet.getInt("Passagerer_ud");
        int baggageOut_time = resultSet.getInt("Baggage_ud");
        int refuel_time = resultSet.getInt("Brændstof_påfyldning");
        int cleaing_time = resultSet.getInt("Rengøring");
        int baggageIn_time = resultSet.getInt("Baggage_ind");
        int passengersIn_time = resultSet.getInt("Passagerer_ind");
        int taxiToExit_time = resultSet.getInt("Taxi_ud_til_afgang");
        int taxiToAndFromWaitingSpots = resultSet.getInt("Taxi_til_og_fra_ventepladser");
        int personalToAndFrom = resultSet.getInt("Personale_til_og_fra_naboplads");
        int personalToAndFromOwnTerminal = resultSet.getInt("Personale_til_og_fra_øvrige_i_egen_terminal");
        int personalToAndFromOtherTerminal = resultSet.getInt("Personale_til_og_fra_den_anden_terminal");

        return new AirportServiceCompany(id, size, taxiIn_time, passengerOut_time, baggageOut_time, refuel_time, cleaing_time, baggageIn_time, passengersIn_time, taxiToExit_time, taxiToAndFromWaitingSpots, personalToAndFromOwnTerminal, personalToAndFromOtherTerminal);
    }
}
