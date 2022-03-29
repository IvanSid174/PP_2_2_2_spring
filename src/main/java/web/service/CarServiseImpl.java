package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiseImpl implements CarService{
    private  static List <Car> carList = new ArrayList<Car>();
    static {
        carList.add(new Car("Лада","Серая",1));
        carList.add(new Car("Лада2","Серая2",2));
        carList.add(new Car("Лада3","Серая3",3));
        carList.add(new Car("Лада4","Серая4",4));
        carList.add(new Car("Lada5","Gray5",5));

    }
    @Override
    public  List<Car> carNumber (int i) {
        if (i == 0) {
            return carList;
        }
        return carList.stream().limit(i).collect(Collectors.toList());
    }


}
