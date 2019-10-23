package dat18c.airport_app.repositories;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.AirportServiceCompany;
import dat18c.airport_app.repositories.interfaces.ICrud;


public class AirportServiceCompanyRepository implements ICrud<AirportServiceCompany> {
    private Connection connection;
    static Scanner input;

    public AirportServiceCompanyRepository(IDatabaseConnection databaseConnection) {
        this.connection = databaseConnection.getConnection();
    }

    public List<AirportServiceCompany> fetchAll() throws SQLException {
        List<AirportServiceCompany> serviceSelskaber = new ArrayList<AirportServiceCompany>();

        var statement = connection.createStatement();
        var resultSet = statement.executeQuery("SELECT * FROM serviceselskab");

        while (resultSet.next()) {
            serviceSelskaber.add(mapToServiceSelskab(resultSet));
        }

        statement.close();
        resultSet.close();
        return serviceSelskaber;
    }

    @Override
    public AirportServiceCompany findById(int id) throws SQLException {
        return null;
    }

    @Override
    public void update(AirportServiceCompany o) throws SQLException {

    }

    @Override
    public void create(AirportServiceCompany o) throws SQLException {

    }

    @Override
    public void deleteById(int id) throws SQLException {

    }

    private AirportServiceCompany mapToServiceSelskab(ResultSet resultSet) throws SQLException {
        return null;
    }

    //Denne metode lavet en insert i serviceselskab tabel.
    public void insert() {

        input = new Scanner(System.in);
        String sql = "INSERT INTO serviceselskab(idServiceSelskab, size, Taxi_ind_ved_ankomst, Passagerer_ud," +
                "Bagage_ud, Brændstof_påfyldning, Rengøring, Bagage_ind, Passagerer_ind, Taxi_ud_til_afgang," +
                "Taxi_til_og_fra_ventepladser, Personale_til_og_fra_naboplads, Personale_til_og_fra_øvrige_i_egen_terminal," +
                "Personale_til_og_fra_den_anden_terminal ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

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
            if (rowsInserted > 0) {
                System.out.println("Info added");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
