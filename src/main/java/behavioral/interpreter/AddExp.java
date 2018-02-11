package behavioral.interpreter;

public class AddExp implements Exp {

    Exp first;
    Exp second;

    public AddExp(Exp first, Exp second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int evaluate() {
        return first.evaluate() + second.evaluate();
    }
}
