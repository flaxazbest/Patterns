package structural.decorator;

public class DeepFried extends PizzaDecorator {
    public DeepFried(Item pizza) {
        super(pizza);
    }

    public void prepare() {
        super.prepare();
        System.out.print(" + Deep Fried");
    }
}
