package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import web.dao.CarList;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

//    @Autowired
//    CarList carList;
//
//    @Override
//    public void add(Car car) {
//        carList.addCar(car);
//    }

    @Override
    public List<Car> listCar(List<Car> cars, int count) {
        for (int i = 4; i >= count; i--){
            cars.remove(i);
        }

        return cars;
    }
}
