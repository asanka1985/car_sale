package org.example.service;

import org.example.dao.CarEntity;
import org.example.dto.Car;
import org.example.repo.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CarServiceImp implements CarService {
    @Autowired
    CarRepository carRepository;

    @Override
    public void setCar(Car car) {
        CarEntity carEntity=new CarEntity();
        carEntity.setBrand(car.getBrand());
        carEntity.setColor(car.getColor());
        carEntity.setModel(car.getModel());
        carEntity.setFuel_efficient(car.getFuel_efficient());
        carEntity.setGear_system(car.getGear_system());
        carEntity.setPassenger_count(car.getPassenger_count());
        carEntity.setCar_number(car.getCar_number());
        carEntity.setMade_year(car.getMade_year());

        carRepository.save(carEntity);
    }

    @Override
    public Iterable<CarEntity> getCar() {
        return carRepository.findAll();
    }

    @Override
    public void updateCar(Car car) {
        CarEntity carEntity=new CarEntity();
        carEntity.setBrand(car.getBrand());
        carEntity.setColor(car.getColor());
        carEntity.setModel(car.getModel());
        carEntity.setFuel_efficient(car.getFuel_efficient());
        carEntity.setGear_system(car.getGear_system());
        carEntity.setPassenger_count(car.getPassenger_count());
        carEntity.setCar_number(car.getCar_number());
        carEntity.setMade_year(car.getMade_year());

    }

    @Override
    public void deleteCar(Long aLong) {
        carRepository.deleteById(aLong);
    }


}
