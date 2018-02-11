package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ActMediatorImpl implements ActMediator {
    private Runway runway;
    private List<Gate> gates;

    public ActMediatorImpl() {
        gates = new ArrayList<>();
    }


    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void registerGate(Gate gate) {
        gates.add(gate);
    }

    @Override
    public boolean getLandingPermission(Flight flight) {
        if (!runway.isInUse()) {
            for (Gate gate: gates) {
                if (!gate.isInUse()) {
                    flight.setRunway(runway);
                    flight.setGate(gate);
                    return true;
                }
            }
            System.out.println("[ATC Mediator] All gates in use");
        }
        else {
            System.out.println("[ATC Mediator] Runway in use");
        }
        return false;
    }

    @Override
    public boolean getTakeoffPermission(Flight flight) {
        return !runway.isInUse();
    }

    @Override
    public void enterRunway(Runway runway) {
        runway.setInUse(true);
    }

    @Override
    public void exitRunway(Runway runway) {
        runway.setInUse(false);
    }

    @Override
    public void enterGate(Gate gate) {
        gate.setInUse(true);
    }

    @Override
    public void exitGate(Gate gate) {
        gate.setInUse(false);
    }
}
