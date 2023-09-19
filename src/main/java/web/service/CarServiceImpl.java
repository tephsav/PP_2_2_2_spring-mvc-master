package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCountCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "Black", 2019));
        cars.add(new Car("BMW", "Red", 2018));
        cars.add(new Car("Mercedes", "Blue", 2017));
        cars.add(new Car("Volvo", "Green", 2016));
        cars.add(new Car("Ford", "Yellow", 2015));

        return cars.stream().limit(count).toList();
    }
}
