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
        super.cook();
        System.out.println("Cooked 1 more minutes");
    }
}
