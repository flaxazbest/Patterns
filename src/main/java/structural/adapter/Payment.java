package structural.adapter;

public class Payment {

    public String type;
    public double amount;

    public Payment(String type, double amount) {
        super();
        this.type = type;
        this.amount = amount;
    }

    public void pay() {
        System.out.println(type + " " + amount + "S");
    }
}
