package strategy;

public class App {
    public static void main(String[] args) {
        System.out.println("------------------");
        printOrder(EnumType.NUMERICAL);
        System.out.println("------------------");
        printOrder(EnumType.VERBAL);
        System.out.println("------------------");
        printOrder(EnumType.EQUAL_LEVEL);
    }
    private static void printOrder(EnumType type){
        Student student = new Student(type);
        String priorityOrder = student.getPriorityOrder();
        System.out.println(priorityOrder);
    }
}
