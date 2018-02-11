package behavioral.command;

public class MainDish {

    String name;

    public MainDish(String name) {
        this.name = name;
    }

    public void order() {
        System.out.println("Main Dish (" + name + ") is ordered");
    }

    public void cancel() {
        System.out.println("Main Dish (" + name + ") is canceled");
    }
}
