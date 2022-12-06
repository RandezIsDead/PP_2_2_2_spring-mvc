package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    private static int CAR_COUNT;
    private final List<Car> listOfCars;

    {
        listOfCars = new ArrayList<>();

        listOfCars.add(new Car(++CAR_COUNT, "Toyota Corolla 1", 100));
        listOfCars.add(new Car(++CAR_COUNT, "Toyota Corolla 2", 101));
        listOfCars.add(new Car(++CAR_COUNT, "Toyota Corolla 3", 102));
        listOfCars.add(new Car(++CAR_COUNT, "Toyota Corolla 4", 103));
        listOfCars.add(new Car(++CAR_COUNT, "Toyota Corolla 5", 104));
    }

    public List<Car> index() {
        return listOfCars;
    }

    public List<Car> show(int i) {
        if (i > CAR_COUNT) i = CAR_COUNT;
        return listOfCars.subList(0, i);
    }
}
