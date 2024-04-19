package daos;

import models.Car;

import java.util.ArrayList;
import java.util.Set;

public interface InterfaceCar {
    Car getCar();
    Set<Car> getAllCars();
    Car getCarById();
    boolean updateCar();
    boolean createCar();
    boolean deleteCar();
}
