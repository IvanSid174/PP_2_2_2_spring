package web.controller;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiseImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {

@Autowired
private CarService carService;

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count") Optional<Integer> count, Model model) {
        List <Car> carList = carService.carNumber(count.orElse(0));
        model.addAttribute("cars", carList);
        return "cars";
    }


}
