package structural.composite;

public class CompositeClient {

    public static void main(String[] args) {
        Product p1 = new Product(1);
        Product p2 = new Product(2);
        Product p3 = new Product(3);
        Product p4 = new Product(4);

        Box box1 = new Box(1);
        Box box2 = new Box(2);
        Box box3 = new Box(3);

        box1.add(p1);
        box1.add(p2);
        box1.add(p3);

        box2.add(p4);

        box3.add(box1);
        box3.add(box2);

        box3.print(0);
    }

}
