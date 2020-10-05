package structural.decorator;

public class OnionPizza extends PizzaDecorator {
    public OnionPizza(Item pizza) {
        super(pizza);
    }

    public void prepare() {
        super.prepare();
        System.out.print(" + with Onion");
    }
}
