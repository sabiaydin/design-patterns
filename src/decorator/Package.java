package decorator;

import java.util.ArrayList;
import java.util.List;

abstract class Package implements ICar {
    private String name;
    protected ICar car;
    protected double price;

    private List<Package> componentList = new ArrayList<>();

    public Package(String name, ICar car, double price) {
        this.name = name;
        this.car = car;
        this.price = price;
        componentList.add(this);
    }

    @Override
    public double calculatePrice() {
        return car.calculatePrice() + price;
    }

    @Override
    public List<Package> getComponents() {
        List<Package> currentComponentList = car.getComponents();
        currentComponentList.add(this);
        return currentComponentList;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ICar getCar() {
        return car;
    }

    public void setCar(ICar car) {
        this.car = car;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Package> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<Package> componentList) {
        this.componentList = componentList;
    }
}
