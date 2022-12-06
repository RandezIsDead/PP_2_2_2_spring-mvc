package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.CarService;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String index(Model model) {
        model.addAttribute("cars", carService.index());
        return "cars";
    }

    @GetMapping("/cars={i}")
    public String show(@PathVariable("i") int i, Model model) {
        model.addAttribute("cars", carService.show(i));
        return "cars";
    }
}
