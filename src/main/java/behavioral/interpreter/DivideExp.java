package behavioral.interpreter;

public class DivideExp implements Exp {

    Exp first;
    Exp second;

    public DivideExp(Exp first, Exp second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int evaluate() {
        return first.evaluate() / second.evaluate();
    }

}
