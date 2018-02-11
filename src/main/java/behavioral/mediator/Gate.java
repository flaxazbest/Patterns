package behavioral.mediator;

public class Gate {
    private String gateNum;
    private boolean inUse;

    public Gate(String gateNum, boolean inUse) {
        this.gateNum = gateNum;
        this.inUse = inUse;
    }

    public String getGateNum() {
        return gateNum;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}