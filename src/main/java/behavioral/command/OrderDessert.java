package behavioral.command;

public class OrderDessert implements Command {

    private Dessert coupon;

    public OrderDessert(Dessert coupon) {
        this.coupon = coupon;
    }

    @Override
    public void execute() {
        coupon.order();
    }
}
