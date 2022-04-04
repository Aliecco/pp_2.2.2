package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarList;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    CarList carList;

    @Override
    public List<Car> listCar(List<Car> cars, int count) {
        if (5 > count) {
            cars.subList(count, 5).clear();
        }

        return cars;
    }
    /*
    Хотел сделать так чтобы с контроллера не надо было отправлять лист Car,
    но выдает NullPointException.
    */
//    @Override
//    public List<Car> listCar(int count) {
//        List<Car> cars = carList.getCars();
//        if (5 > count) {
//            cars.subList(count, 5).clear();
//        }
//
//        return cars;
//    }
}
