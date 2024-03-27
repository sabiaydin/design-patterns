package prototype;

public class Circle extends Shape {
    public int radius;
    public Circle(){
    }
    public Circle(Circle circle){
        super(circle);
        this.radius=circle.radius;
    }
    @Override
    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
