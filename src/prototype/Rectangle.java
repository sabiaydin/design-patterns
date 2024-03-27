package prototype;

public class Rectangle extends Shape{
    public int width;
    public int height;
    public Rectangle(){}
    public Rectangle(Rectangle rectangle){
        super(rectangle);
        this.height=rectangle.height;
        this.width=rectangle.width;
    }
    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
