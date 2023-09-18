package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, @RequestParam(required = false, defaultValue = "5") int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "Black", 2019));
        cars.add(new Car("BMW", "Red", 2018));
        cars.add(new Car("Mercedes", "Blue", 2017));
        cars.add(new Car("Volvo", "Green", 2016));
        cars.add(new Car("Ford", "Yellow", 2015));
        List<Car> filterCars = new CarServiceImpl().getCountCars(cars, count);
        model.addAttribute("cars", filterCars);

        return "car";
    }
}
