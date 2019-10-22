package dat18c.airport_app.service;

import dat18c.airport_app.model.Standplads;

import java.util.List;

public class StandpladsService implements ICrud<Standplads>
{
    StandpladsRepo standpladsRepo;

    @Override
    public List<Standplads> fetchAll() {
        return null;
    }

    @Override
    public Standplads findById(int id) {
        return null;
    }

    @Override
    public void update(Standplads standplads) {

    }

    @Override
    public void addItem(Standplads standplads) {

    }

    @Override
    public void deleteById(int id) {

    }
}
