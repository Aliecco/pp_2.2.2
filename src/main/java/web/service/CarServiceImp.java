package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarList;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

//    @Autowired
//    CarList carList;
//    private List<Car> cars = carList.getCars();

    @Override
    public List<Car> listCar(List<Car> cars, int count) {
        return cars.subList(0, count);
    }

//    @Override
//    public List<Car> listCar(int count) {
//        return cars.subList(0, count);
//    }
}
