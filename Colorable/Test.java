package Colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(3);
        if (shapes[0] instanceof Colorable) {
            ((Colorable)shape).howToColor();
        }
    }
}
