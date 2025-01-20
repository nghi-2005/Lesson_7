package ResizeableSRC;

public class Circle implements Resizeable {
    private double radius;
   public Circle(double radius) {
       this.radius = radius;
   }

    @Override
    public void resize(double percent) {
        radius += percent * radius/100;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
