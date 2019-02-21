package cars;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {
    List<Car> findCarsByBrand(String brand);
    List<Car> findCarsByHorsePowerAfter(Integer horsepower);
    Car findCarById(Integer id);

}
