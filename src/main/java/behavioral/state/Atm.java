package behavioral.state;

public class Atm implements AtmState {

    int cashStock;
    AtmState currentState;

    public Atm() {
        currentState = new NoCash(this);
    }

    public int getCashStock() {
        return this.cashStock;
    }

    public void setCashStock(int cashStock) {
        this.cashStock = cashStock;
    }

    public AtmState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(AtmState currentState) {
        this.currentState = currentState;
    }

    @Override
    public void withdraw(int amount) {
        currentState.withdraw(amount);
    }

    @Override
    public void refill(int amount) {
        currentState.refill(amount);
    }
}
