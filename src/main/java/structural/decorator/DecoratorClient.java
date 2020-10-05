package structural.decorator;

public class DecoratorClient {

    public static void main(String[] args) {
        Item[] order = {
                new DeepFried(new Pizza()),
                new DeepFried(
                        new DoubleCheese(
                        new Pizza())),
                new DoubleCheese(
                        new Spicy(
                        new DeepFried(
                        new Pizza()))),
                new OnionPizza(new DoubleCheese(new Spicy(new DeepFried(new Pizza()))))
        };


        for (Item item : order) {
            item.prepare();
            System.out.println();
        }
/*
        Item p1 = new Pizza();
        p1.prepare();

        System.out.println();
        Item p2 = new OnionPizza(new DoubleCheese(new DoubleCheese(new Pizza())));
        p2.prepare();
*/
    }

}
