package dat18c.airport_app.service;


import dat18c.airport_app.model.ServiceSelskab;
import dat18c.airport_app.repositories.ServiceSelskabRepo;

import java.util.List;

class ServiceSelskabService implements ICrud<ServiceSelskab> {

    ServiceSelskabRepo serviceselskabRepo;

    @Override
    public List<ServiceSelskab> fetchAll() {
        return null;
    }

    @Override
    public ServiceSelskab findById(int id) {
        return null;
    }

    @Override
    public void update(ServiceSelskab serviceSelskab) {
    }

    @Override
    public void addItem(ServiceSelskab serviceSelskab) {

    }

    @Override
    public void deleteById(int id) {

    }
}
