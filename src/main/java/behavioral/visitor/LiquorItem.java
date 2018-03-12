package behavioral.visitor;

public class LiquorItem implements Visitable {

    public int id;
    public String name;
    public double price;

    public LiquorItem(int id, String name, double price) {
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
