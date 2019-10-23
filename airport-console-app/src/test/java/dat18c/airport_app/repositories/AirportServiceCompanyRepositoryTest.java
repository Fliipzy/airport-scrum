package dat18c.airport_app.repositories;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.AirportServiceCompany;
import dat18c.airport_app.repositories.interfaces.ICrud;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AirportServiceCompanyRepositoryTest implements ICrud<AirportServiceCompany> 
{
    private Connection connection;
    static Scanner input;
    private ArrayList<String> list;

    @BeforeEach
    void setUp() 
    {
    }

    @AfterEach
    void tearDown() 
    {
    }


    @Test
    void findById() throws SQLException {

        System.out.println("Test");
        IDatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        AirportServiceCompanyRepository airportService = new AirportServiceCompanyRepository(dbConnection);

        assertEquals(null, airportService.findById(4));

    }

    @Test
    void update() throws SQLException {
        IDatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        AirportServiceCompanyRepository airportService = new AirportServiceCompanyRepository(dbConnection);
        airportService.updateServiceTable();
        input = new Scanner(System.in);
        String sql = "UPDATE serviceselskab SET idServiceSelskab=?";
        PreparedStatement teststatement = connection.prepareStatement("UPDATE serviceselskab SET idServiceSelskab=?");
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, 10);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        assertEquals(sql, "10");
    }

        @Test
    void create() {
    }

    @Test
    void deleteById()
    {
        System.out.println("Test");
        IDatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        AirportServiceCompanyRepository airportService = new AirportServiceCompanyRepository(dbConnection);

        assertEquals(airportService, airportService);

    }

    @Test
    void deleteServiceSelskab() throws SQLException 
    {
        System.out.println("Test");
        IDatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        AirportServiceCompanyRepository airportService = new AirportServiceCompanyRepository(dbConnection);

        airportService.deleteServiceSelskab();
        assertEquals(airportService, airportService);
    }

    @Test
    void insert() {

        list.add("test");
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
    }

    @Test
    @Override
    public List<AirportServiceCompany> fetchAll() throws SQLException {
        return null;
    }

    @Override
    public AirportServiceCompany findById(int id) throws SQLException {
        return null;
    }

    @Override
    public void update(AirportServiceCompany airportServiceCompany) throws SQLException {

    }

    @Override
    public void create(AirportServiceCompany airportServiceCompany) throws SQLException {

    }

    @Override
    public void deleteById(int id) throws SQLException {

    }
}