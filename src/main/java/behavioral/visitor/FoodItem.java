package behavioral.visitor;

public class FoodItem implements Visitable {

    public int id;
    public String name;
    public double price;

    public FoodItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void apply(Visitor visitor) {
        visitor.visit(this);
    }
}
