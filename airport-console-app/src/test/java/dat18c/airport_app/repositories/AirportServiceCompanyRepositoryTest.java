package dat18c.airport_app.repositories;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class AirportServiceCompanyRepositoryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fetchAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void update() {
    }

    @Test
    void create() {
    }

    @Test
    void deleteById()
    {


    }

    @Test
    void deleteServiceSelskab() throws SQLException {
        System.out.println("Test");
        IDatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        AirportServiceCompanyRepository airportService = new AirportServiceCompanyRepository(dbConnection);

        airportService.deleteServiceSelskab();
        assertEquals(1, 1);
    }

    @Test
    void insert() {
    }
}