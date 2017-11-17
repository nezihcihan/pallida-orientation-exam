package com.greenfox.exam.spring.models;

import javax.persistence.*;

@Entity
@Table(name = "licence_plates")
public class Car {

    @Id
    private String plate;

    @Column(name="car_brand")
    private String brand;
    @Column(name="car_model")
    private String model;
    @Column (name="color")
    private String color;
    @Column (name="year")
    private int year;

    public Car(String plate, String brand, String model, String color, int year) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Car() {
    }

    public Car(String plate) {
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
