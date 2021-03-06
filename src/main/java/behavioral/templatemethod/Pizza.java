package behavioral.templatemethod;

public abstract class Pizza {

    public final void preparePizza() {
        selectCrust();
        addIngredients();
        addToppings();
        cook();
    }

    protected void cook() {
        System.out.println("Cooked for 11 minutes");
    }

    private void selectCrust() {
        System.out.println("Selected special crush");
    }

    protected abstract void addIngredients();
    protected abstract void addToppings();

}
