package behavioral.observer;

public class Payment {
    public String type;
    public final double amount;

    public Payment(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}
