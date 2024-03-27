package abstractFactory;

public class Iphone14Pro implements Phone{
    private String model;
    private String battery;
    private int width;
    private int height;

    public Iphone14Pro(String model, String battery, int width, int height) {
        this.model = model;
        this.battery = battery;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getBattery() {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public String toString() {
        return "Iphone14Pro{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
