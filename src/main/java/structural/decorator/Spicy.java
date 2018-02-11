package structural.decorator;

public class Spicy extends PizzaDecorator {
    public Spicy(Item pizza) {
        super(pizza);
    }

    public void prepare() {
        super.prepare();
        System.out.print(" + Spicy");
    }
}
