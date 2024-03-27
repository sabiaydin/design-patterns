package strategy;

public class EqualLevelStrategy implements ExamStrategy{
    @Override
    public EnumLessons getFirst() {
        return EnumLessons.AZERBAIJAN_LANGUAGE;
    }

    @Override
    public EnumLessons getSecond() {
        return EnumLessons.MATHS;
    }

    @Override
    public EnumLessons getThird() {
        return EnumLessons.SOCIAL;
    }

    @Override
    public EnumLessons getFourth() {
        return EnumLessons.SCIENCE;
    }
}
