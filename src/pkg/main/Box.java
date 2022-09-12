package pkg.main;

public class Box <T> {
    private T field;

    public Box(T field) {
        this.field = field;
    }

    public static Box method(Box<?> something){
        return something;
    }

    @Override
    public String toString() {
        return "Box{"+field.getClass().getSimpleName()+"}";
    }
}
