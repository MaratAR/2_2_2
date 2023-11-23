package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDao {

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("BMW", 2001, 45000));
        carList.add(new Car("AUDi", 2002, 25000));
        carList.add(new Car("HONDA", 2003, 55000));
        carList.add(new Car("HYUNDAI", 2004, 65000));
        carList.add(new Car("PEUGEOT", 2005, 78000));
    }

    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
