package decorator;

import java.util.ArrayList;
import java.util.List;

public class BasicCar implements ICar{
    private String brand;
    protected double price;

    public BasicCar(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public List<Package> getComponents() {
        return new ArrayList<Package>();
    }
}
