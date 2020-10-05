package behavioral.templatemethod;

public class MeatPizza extends Pizza {
    @Override
    protected void addIngredients() {
        System.out.println("Added meat pizza ingredients");
    }

    @Override
    protected void addToppings() {
        System.out.println("Added meat pizza toppings");
    }

//    protected void cook() {
//        System.out.println("Cooked for 15 minutes");
//    }
}
