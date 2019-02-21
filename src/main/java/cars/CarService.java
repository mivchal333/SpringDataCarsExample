package cars;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

    public void printCarsByBrand(String brand){
        List<Car> cars = carRepository.findCarsByBrand(brand);
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public void printCarsByHorsePowerAfter(Integer horsepower){
        List<Car> cars = carRepository.findCarsByHorsePowerAfter(horsepower);
        for (Car car : cars) {
            System.out.println(car);
        }

    }

    public void printCarById(Integer id){
        Car car = carRepository.findCarById(id);
        Optional<Car> carOpt = Optional.ofNullable(car);
        if (carOpt.isPresent()) System.out.println(car);
        else System.out.println("There isn't car which id = " + id);
    }
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}
