package dat18c.airport_app.service;

import dat18c.airport_app.model.FlySelskab;

import java.util.List;

public class FlySelskabService implements ICrud<FlySelskab>
{

    FlySelskabRepo flySelskabRepo;

    @Override
    public List<FlySelskab> fetchAll() {
        return null;
    }

    @Override
    public FlySelskab findById(int id) {
        return null;
    }

    @Override
    public void update(FlySelskab flySelskab) {

    }

    @Override
    public void addItem(FlySelskab flySelskab) {

    }

    @Override
    public void deleteById(int id) {

    }
}
