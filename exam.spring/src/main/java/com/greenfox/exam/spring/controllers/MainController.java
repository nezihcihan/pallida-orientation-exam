package com.greenfox.exam.spring.controllers;


import com.greenfox.exam.spring.models.Car;
import com.greenfox.exam.spring.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    CarRepository carRepository;

    @GetMapping({"/"})
    public String list(Model model) {

        model.addAttribute("cars", carRepository.findAll());
        return  "index";
    }

    @PostMapping("/create")
    public ModelAndView create(@RequestParam("plate") String plate) {
        carRepository.save(new Car(plate));
        return new ModelAndView("redirect:/");
    }

    @GetMapping({"/search"})
    public String filterName(@RequestParam(required = false) String search, Model model) {
        model.addAttribute("cars", carRepository.findAllByPlate(search));
        return "index";
    }
}
