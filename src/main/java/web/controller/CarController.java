package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public String printCar(@RequestParam(value = "count", required = false) String result,
                           ModelMap model) {
        int count = 5;

        if (result != null) {
            count = Integer.parseInt(result);
        }

        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("BMW", "black", 111);
        Car car2 = new Car("Audi", "white", 222);
        Car car3 = new Car("Toyota", "blue", 333);
        Car car4 = new Car("Porsche", "red", 444);
        Car car5 = new Car("Lada", "green", 555);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        CarServiceImp serv = new CarServiceImp();
        List<Car> carList = serv.listCar(cars, count);

        model.addAttribute("cars", carList);

        return "car";
    }
}
