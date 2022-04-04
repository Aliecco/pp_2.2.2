package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarList;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public String printCar(@RequestParam(defaultValue = "5")  int count,
                           ModelMap model) {

        CarList cars = new CarList();
        CarServiceImp service = new CarServiceImp();

        model.addAttribute("cars",
                service.listCar(cars.getCars(), count));

        return "car";
    }
}
