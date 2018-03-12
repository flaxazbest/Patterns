package behavioral.visitor;

public class TaxVisitor implements Visitor {

    private double totalTax;

    @Override
    public void visit(FoodItem item) {
        double tax = item.getPrice() * 0.02;
        totalTax += tax;
        item.setPrice(item.getPrice() - tax);
    }

    @Override
    public void visit(LiquorItem item) {
        double tax = item.getPrice() * 0.20;
        totalTax += tax;
        item.setPrice(item.getPrice() - tax);
    }

    public double getTotalTax() {
        return totalTax;
    }
}
