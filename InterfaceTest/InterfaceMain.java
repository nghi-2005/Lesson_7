package InterfaceTest;

public class InterfaceMain {
    public static void main(String[] args) {
        ISharp p;

        p = new Rectangle();
        p.display("Rectangle");
        p.draw();

        Rectangle r = (Rectangle) p;
        r.changeColor("blue");
    }
}
