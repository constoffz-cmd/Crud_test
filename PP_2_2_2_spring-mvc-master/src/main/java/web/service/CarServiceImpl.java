package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{
    private List<Car> carList;

    @Override
    public List<Car> howMany(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 5, 2020));
        cars.add(new Car("Audi", 6, 2018));
        cars.add(new Car("Tesla", 3, 2022));
        cars.add(new Car("Lada", 2107, 1995));
        cars.add(new Car("Toyota", 200, 2015));

        if (count == 0 || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
