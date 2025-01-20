package ResizeableSRC;

public class Square implements Resizeable {
    private double side;
    public Square(double size) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        side += side * percent/100;
    }
}
