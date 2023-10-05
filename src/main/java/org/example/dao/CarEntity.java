package org.example.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long car_ID;
    private String brand;
    private String color;
    private String model;
    private String fuel_efficient;
    private String gear_system;
    private String passenger_count;
    private String car_number;
    private String made_year;

    public Long getCar_ID() {
        return car_ID;
    }

    public void setCar_ID(Long car_ID) {
        this.car_ID = car_ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel_efficient() {
        return fuel_efficient;
    }

    public void setFuel_efficient(String fuel_efficient) {
        this.fuel_efficient = fuel_efficient;
    }

    public String getGear_system() {
        return gear_system;
    }

    public void setGear_system(String gear_system) {
        this.gear_system = gear_system;
    }

    public String getPassenger_count() {
        return passenger_count;
    }

    public void setPassenger_count(String passenger_count) {
        this.passenger_count = passenger_count;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public String getMade_year() {
        return made_year;
    }

    public void setMade_year(String made_year) {
        this.made_year = made_year;
    }
}
