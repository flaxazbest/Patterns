package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List cart = new ArrayList();
    List payments = new ArrayList();

    private final String FORMAT = "%-20s %s";

    public void addItem(Item item) {
        cart.add(item);
        System.out.println(String.format(FORMAT, item.getName(), item.getPrice()));
    }

    public void makePayment(PaymentStrategy ps) {
        payments.add(ps);
        ps.pay();
    }

}
