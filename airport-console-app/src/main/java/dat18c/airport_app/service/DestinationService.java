package dat18c.airport_app.service;

import dat18c.airport_app.model.Destination;

import java.util.List;

public class DestinationService implements ICrud<Destination>
{
    DestinationRepo destinationRepo;


    @Override
    public List<Destination> fetchAll() {
        return null;
    }

    @Override
    public Destination findById(int id) {
        return null;
    }

    @Override
    public void update(Destination destination) {

    }

    @Override
    public void addItem(Destination destination) {

    }

    @Override
    public void deleteById(int id) {

    }
}
