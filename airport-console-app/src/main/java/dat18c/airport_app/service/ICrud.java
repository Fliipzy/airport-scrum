package dat18c.airport_app.service;

import java.util.List;

public interface ICrud<T> {

    List fetchAll();

    T findById(int id);

    void update(T t);

    void addItem(T t);

    void deleteById(int id);
}
