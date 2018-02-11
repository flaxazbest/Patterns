package structural.bridge;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Draw circle in ");
        color.applyColor();
    }
}
