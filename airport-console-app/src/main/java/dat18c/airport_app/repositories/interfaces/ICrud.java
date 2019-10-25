package dat18c.airport_app.repositories.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface ICrud<TType, TId> 
{
    List<TType> fetchAll() throws SQLException;

    TType findById(TId id) throws SQLException;

    void update(TType t) throws SQLException;

    void create(TType t) throws SQLException;

    void deleteById(TId id) throws SQLException;
}
