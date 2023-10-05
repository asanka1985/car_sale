package org.example.controller;

import org.example.dao.CarEntity;
import org.example.dto.Car;
import org.example.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class CarController {
   @Autowired
    CarService service;

    @PostMapping("/car")
    public void setCar(@RequestBody Car car){
        service.setCar(car);
    }

    @GetMapping("/car")
    public Iterable<CarEntity> getCar(){
        return service.getCar();
    }

    @PutMapping("/car")
    public void updateCar(@RequestBody Car car){
        service.updateCar(car);
    }

    @DeleteMapping("/car/{carId}")
    public void deleteCar(@PathVariable String carId){
        service.deleteCar(Long.valueOf(carId));
    }
}
