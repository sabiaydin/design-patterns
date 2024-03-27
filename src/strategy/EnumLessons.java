package strategy;

public enum EnumLessons {
    AZERBAIJAN_LANGUAGE("Azerbaijan language"),
    MATHS ("Maths"),
    SCIENCE("Science"),
    SOCIAL("Social")
    ;
    private String lesson;

    EnumLessons(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return lesson;
    }
}
