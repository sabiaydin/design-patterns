package prototype;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Application app=new Application();
        List<Shape> list=app.getShapes();
        for(Shape shape : list){
            System.out.println(shape);
        }
    }
}
