package strategy;

public class Student {
   private EnumType type;
   private ExamStrategy examStrategy;

    public Student(EnumType type) {
        this.type = type;
        if (type==null){
            throw new NullPointerException("Type can not be empty");
        }
        switch (type){
            case VERBAL:
               examStrategy=new VerbalStrategy();
            break;

            case NUMERICAL:
                examStrategy = new NumericalStrategy();
            break;

            case EQUAL_LEVEL:
                examStrategy=new EqualLevelStrategy();
                break;

            default:
                break;

        }
    }
 public String getPriorityOrder(){
     System.out.println("Strategy for " + type );
     String order = "Firstly solve " + examStrategy.getFirst()+",\n"+
             "After solve " + examStrategy.getSecond()+",\n"+
             "Later solve " + examStrategy.getThird() + ",\n"+
             "😭if there is time you can solve " + examStrategy.getFourth();

     return order;
 }
}
