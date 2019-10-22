package dat18c.airport_app.service;

import dat18c.airport_app.model.Fly;

import java.util.List;

public class FlyService implements ICrud<Fly>
{

    FlyRepo flyRepo;

    @Override
    public List<Fly> fetchAll() {
        return null;
    }

    @Override
    public Fly findById(int id) {
        return null;
    }

    @Override
    public void update(Fly fly) {

    }

    @Override
    public void addItem(Fly fly) {

    }

    @Override
    public void deleteById(int id) {

    }
}
