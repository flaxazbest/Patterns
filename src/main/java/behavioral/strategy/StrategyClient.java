package behavioral.strategy;

public class StrategyClient {

    public static void main(String[] args) {
        System.out.println("Strategy");
        Order order = new Order();
        order.addItem(new Item("Burger", 2.99));
        order.addItem(new Item("Coffee", 0.95));
        order.addItem(new Item("Banana", 0.29));
        order.addItem(new Item("Almonds", 11.89));
        System.out.println("===================================================");
        order.makePayment(new CashPayment(20.00));
        order.makePayment(new CardPayment("CREDIT","VISA", 10.00));
        order.makePayment(new CardPayment("DEBIT","MasterCard", 10.00));
        System.out.println("===================================================");
    }

}
