package behavioral.interpreter;

public class SubstractExp implements Exp {

    Exp first;
    Exp second;

    public SubstractExp(Exp first, Exp second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int evaluate() {
        return first.evaluate() - second.evaluate();
    }

}
