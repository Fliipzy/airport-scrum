package dat18c.airport_app.repositories.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface ICrud<T> 
{
    List<T> fetchAll() throws SQLException;

    T findById(int id) throws SQLException;

    void update(T t) throws SQLException;

    void create(T t) throws SQLException;

    void deleteById(int id) throws SQLException;
}
