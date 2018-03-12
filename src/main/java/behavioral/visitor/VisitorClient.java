package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorClient {

    public static void main(String[] args) {
        List<Visitable> order = new ArrayList<>();
        order.add(new FoodItem(1, "Pizza", 6.99));
        order.add(new LiquorItem(2, "Coffee", 2.09));
        order.add(new LiquorItem(3, "Tea", 0.19));
        order.add(new FoodItem(4, "Apple", 1.49));
        order.add(new FoodItem(5, "Almonds", 11.99));

        DiscountVisitor discountVisitor = new DiscountVisitor();
        TaxVisitor taxVisitor = new TaxVisitor();

        for (Visitable item: order) {
            item.apply(discountVisitor);
            item.apply(taxVisitor);
        }

        System.out.println("Total discount = " + discountVisitor.getTotalDiscount());
        System.out.println("Total Tax = " + taxVisitor.getTotalTax());
    }

}