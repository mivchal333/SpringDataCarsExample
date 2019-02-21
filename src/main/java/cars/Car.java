package cars;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column
    private String brand;

    @Column
    private String model;

    @Column
    private Integer horsePower;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getId() {
        return id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Car() {
    }


    public Car(Integer id, String brand, String model, Integer horsePower) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("id=").append(id);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", horsePower=").append(horsePower);
        sb.append('}');
        return sb.toString();
    }
}
