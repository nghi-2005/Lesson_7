package ResizeableSRC;

import java.util.Random;

public class ResizeableTest {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(6);
        shapes[2] = new Rectangle(7, 8);

        Random r = new Random();

        for (Resizeable shape : shapes) {
            double percent = 1 + r.nextInt(100);
            System.out.println("Diện tích trước khi tăng kích thước : " + shape.getArea());
            shape.resize(percent);
            System.out.println("Tăng kích thước lên: " + percent + "%");
            System.out.println("Diện tích sau khi tăng kích thước: " + shape.getArea());
            System.out.println();
        }
    }

}
