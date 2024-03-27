package prototype;

import java.util.ArrayList;
import java.util.List;

public class Application {
    List<prototype.Shape> shapeList=new ArrayList<>();
    public Application(){
        Circle circle=new Circle();
        circle.x=5;
        circle.y=4;
        circle.radius=6;
        shapeList.add(circle);

        Circle anotherCircle=circle.clone();
        shapeList.add(anotherCircle);

        Rectangle rectangle=new Rectangle();
        rectangle.width=11;
        rectangle.height=12;
        shapeList.add(rectangle);
    }
    List<prototype.Shape> getShapes(){
        List<Shape> shapes =new ArrayList<>();
        for(Shape shape : shapeList){
          shapes.add(shape.clone());
        }
        return shapeList;
    }
}
