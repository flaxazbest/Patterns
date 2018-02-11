package structural.bridge;

public class BridgeClient {

    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(new Red()),
            new Rectangle(new Red()),
            new Square(new Green())
        };

        for (Shape shape: shapes) {
            shape.draw();
        }
    }

}
