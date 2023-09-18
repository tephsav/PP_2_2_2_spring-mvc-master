package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCountCars(List<Car> cars, int count) {
        return cars.stream().limit(count).toList();
    }
}
