package behavioral.interpreter;

public class Number implements Exp {

    private final int n;

    public Number(int n) {
        this.n = n;
    }

    @Override
    public int evaluate() {
        return n;
    }
}
