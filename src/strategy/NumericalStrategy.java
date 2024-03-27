package strategy;

public class NumericalStrategy implements ExamStrategy{
    @Override
    public EnumLessons getFirst() {
        return EnumLessons.MATHS;
    }

    @Override
    public EnumLessons getSecond() {
        return EnumLessons.AZERBAIJAN_LANGUAGE;
    }

    @Override
    public EnumLessons getThird() {
        return EnumLessons.SCIENCE;
    }

    @Override
    public EnumLessons getFourth() {
        return EnumLessons.SOCIAL;
    }
}
