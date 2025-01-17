package InterfaceTest;

public class Rectangle implements ISharp {
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }

    @Override
    public void display(String value) {
        System.out.println("draw rectangle with " + value);
    }
    public void changeColor(String color) {
        System.out.println("change color " + color);
    }
}
