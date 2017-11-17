package com.greenfox.exam.spring.controllers;

import com.greenfox.exam.spring.models.Car;
import com.greenfox.exam.spring.repositories.CarRepository;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class MainRestController {

    @Autowired
    CarRepository carRepository;
    @GetMapping("/search")
    public Object search(@RequestParam("plate") String plate) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < carRepository.findAllByPlate(plate).size(); i++) {
            carList.add(carRepository.findAll().get(i));
        }
        return carList;
    }
}
