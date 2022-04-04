package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarList {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", "black", 111));
        cars.add(new Car("Audi", "white", 222));
        cars.add(new Car("Toyota", "blue", 333));
        cars.add(new Car("Porsche", "red", 444));
        cars.add(new Car("Lada", "green", 555));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car){
        cars.add(car);
    }
}
