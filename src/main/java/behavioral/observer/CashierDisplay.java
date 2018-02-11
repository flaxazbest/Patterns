package behavioral.observer;

public class CashierDisplay implements Observer {
    @Override
    public void update(String string) {
        System.out.print("[CashierDisplay] " + string);
    }
}
