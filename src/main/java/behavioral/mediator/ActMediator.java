package behavioral.mediator;

public interface ActMediator {
    void registerRunway(Runway runway);
    void registerGate(Gate gate);
    boolean getLandingPermission(Flight flight);
    boolean getTakeoffPermission(Flight flight);
    void enterRunway(Runway runway);
    void exitRunway(Runway runway);
    void enterGate(Gate gate);
    void exitGate(Gate gate);
}
