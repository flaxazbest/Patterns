package behavioral.observer;

public class CustomerDisplay implements Observer {
    @Override
    public void update(String string) {
        System.out.println("\t[CustomerDisplay] " + string);
    }
}
