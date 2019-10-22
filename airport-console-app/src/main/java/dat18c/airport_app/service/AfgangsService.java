package dat18c.airport_app.service;

import dat18c.airport_app.model.Afgang;

import java.util.List;

public class AfgangsService implements ICrud<Afgang>
{
    AfgangsRepo afgangsRepo;

    @Override
    public List<Afgang> fetchAll() {
        return null;
    }

    @Override
    public Afgang findById(int id) {
        return null;
    }

    @Override
    public void update(Afgang afgang) {

    }

    @Override
    public void addItem(Afgang afgang) {

    }

    @Override
    public void deleteById(int id) {

    }
}
