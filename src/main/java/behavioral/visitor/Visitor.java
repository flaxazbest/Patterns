package behavioral.visitor;

public interface Visitor {
    void visit(FoodItem item);
    void visit(LiquorItem item);
}
