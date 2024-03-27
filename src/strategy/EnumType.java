package strategy;

public enum EnumType {
    VERBAL("Verbal"),
    NUMERICAL("Numerical"),
    EQUAL_LEVEL("Equal level")
    ;
    private String type;

    EnumType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
