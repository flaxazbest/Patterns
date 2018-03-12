package behavioral.templatemethod;

public class CheesePizza extends Pizza {
    @Override
    protected void addIngredients() {
        System.out.println("Added cheese pizza ingredients");
    }

    @Override
    protected void addToppings() {
        System.out.println("Added cheese pizza toppings");
    }

    protected void cook() {
        System.out.println("Cooked for 12 minutes");
    }
}
