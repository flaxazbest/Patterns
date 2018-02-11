package structural.decorator;

public class DoubleCheese extends PizzaDecorator {
    public DoubleCheese(Item pizza) {
        super(pizza);
    }

    public void prepare() {
        super.prepare();
        System.out.print(" + Double Cheese");
    }
}
