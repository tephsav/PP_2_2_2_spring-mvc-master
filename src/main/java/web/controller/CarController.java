package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, @RequestParam(required = false, defaultValue = "5") int count) {
        List<Car> filterCars = new CarServiceImpl().getCountCars(count);
        model.addAttribute("cars", filterCars);

        return "car";
    }
}
