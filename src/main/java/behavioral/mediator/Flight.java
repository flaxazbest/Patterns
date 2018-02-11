package behavioral.mediator;

public class Flight {
    private ActMediator act;
    private String flightNum;
    private Runway runway;
    private Gate gate;

    public Flight(ActMediator act, String flightNum) {
        this.act = act;
        this.flightNum = flightNum;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public Runway getRunway() {
        return runway;
    }

    public void setRunway(Runway runway) {
        this.runway = runway;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void landAndTakeOff() throws InterruptedException {
        System.out.println(flightNum + " is requasting landing permission");
        while (!act.getLandingPermission(this)) {
            Thread.sleep(1000);
        }
        land();

        while (!act.getTakeoffPermission(this)) {
            Thread.sleep(1000);
        }
        takeOff();
    }

    public void land() {
        act.enterRunway(runway);
        System.out.println(this.flightNum + " is landing, gate is " + gate.getGateNum());

        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                act.exitRunway(runway);
                act.enterGate(gate);
            }
        }, 1000);
    }

    public void takeOff() {
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                System.out.println(flightNum + " is taking off");
                act.exitGate(gate);
                act.enterRunway(runway);

                new java.util.Timer().schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        act.exitRunway(runway);
                    }
                }, 1000);
            }
        }, 5000);
    }

}
