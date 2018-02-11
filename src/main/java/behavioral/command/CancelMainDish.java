package behavioral.command;

public class CancelMainDish implements Command {

    private MainDish item;

    public CancelMainDish(MainDish item) {
        this.item = item;
    }

    @Override
    public void execute() {
        item.cancel();
    }
}
