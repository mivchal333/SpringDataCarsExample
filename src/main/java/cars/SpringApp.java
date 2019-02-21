package cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringApp.class, args);
        CarService service = context.getBean(CarService.class);

        service.printCarsByBrand("BMW");
        service.printCarsByHorsePowerAfter(100);
        service.printCarById(5);

    }

}
