package behavioral.visitor;

public class DiscountVisitor implements Visitor {

    private double totalDiscount;

    @Override
    public void visit(FoodItem item) {
        double discount = item.getPrice() * 0.3;
        totalDiscount += discount;
        item.setPrice(item.getPrice() - discount);
    }

    @Override
    public void visit(LiquorItem item) {
        double discount = item.getPrice() * 0.1;
        totalDiscount += discount;
        item.setPrice(item.getPrice() - discount);
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }
}
