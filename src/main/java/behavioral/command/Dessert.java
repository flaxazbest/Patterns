package behavioral.command;

public class Dessert {

    String name;

    public Dessert(String name) {
        this.name = name;
    }

    public void order() {
        System.out.println("Dessert (" + name + ") is ordered");
    }

    public void cancel() {
        System.out.println("Dessert (" + name + ") is canceled");
    }
}
