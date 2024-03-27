package strategy;

public class VerbalStrategy implements ExamStrategy{
    @Override
    public EnumLessons getFirst() {
        return EnumLessons.AZERBAIJAN_LANGUAGE;
    }

    @Override
    public EnumLessons getSecond() {
        return EnumLessons.SOCIAL;
    }

    @Override
    public EnumLessons getThird() {
        return EnumLessons.MATHS;
    }

    @Override
    public EnumLessons getFourth() {
        return EnumLessons.SCIENCE;
    }
}
