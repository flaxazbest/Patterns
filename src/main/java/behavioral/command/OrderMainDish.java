package behavioral.command;

public class OrderMainDish implements Command {
    private MainDish item;

    public OrderMainDish(MainDish item) {
        this.item = item;
    }

    @Override
    public void execute() {
        item.order();
    }
}
