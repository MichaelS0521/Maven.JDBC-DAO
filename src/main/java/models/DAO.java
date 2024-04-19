package models;

import daos.InterfaceCar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class DAO implements InterfaceCar {

    @Override
    public Car getCar() {
        Connection connection = connectionFactory.getConnection();
        return null;
    }

    @Override
    public Set<Car> getAllCars() {
        return Collections.emptySet();
    }

    @Override
    public Car getCarById() {
        return null;
    }

    @Override
    public boolean updateCar() {
        return false;
    }

    @Override
    public boolean createCar() {
        return false;
    }

    @Override
    public boolean deleteCar() {
        return false;
    }
}
