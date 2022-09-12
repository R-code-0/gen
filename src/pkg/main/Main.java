package pkg.main;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>("Sdf");
        Box<Boolean> bo = new Box<>(false);
        System.out.println(Box.method(box));
        System.out.println(Box.method(bo));
        System.out.println(Box.method(new Box<Float>(45.6f)));
    }
}