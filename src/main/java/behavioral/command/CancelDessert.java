package behavioral.command;

public class CancelDessert implements Command {

    private Dessert coupon;

    public CancelDessert(Dessert coupon) {
        this.coupon = coupon;
    }

    @Override
    public void execute() {
        coupon.cancel();
    }
}
