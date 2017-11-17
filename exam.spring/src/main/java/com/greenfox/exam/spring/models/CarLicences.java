package com.greenfox.exam.spring.models;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Collection;

public class CarLicences {

  ArrayList<Car> CarLicences = new ArrayList<Car>();

    public CarLicences(ArrayList<Car> carLicences) {
        CarLicences = carLicences;
    }

    public ArrayList<Car> getCarLicences() {
        return CarLicences;
    }

    public void setCarLicences(ArrayList<Car> carLicences) {
        CarLicences = carLicences;
    }
}
