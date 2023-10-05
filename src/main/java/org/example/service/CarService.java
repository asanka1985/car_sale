package org.example.service;

import org.example.dao.CarEntity;
import org.example.dto.Car;

public interface CarService {
    void setCar(Car car);

    Iterable<CarEntity> getCar();

    void updateCar(Car car);

    void deleteCar(Long aLong);
}
