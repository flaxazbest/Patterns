package behavioral.mediator;

public class MediatorClient {

    public static void main(String[] args) throws InterruptedException {
        ActMediator actMediator = new ActMediatorImpl();
        actMediator.registerRunway(new Runway("RW-1", false));

        actMediator.registerGate(new Gate("G-1", false));
        actMediator.registerGate(new Gate("G-2", false));
        actMediator.registerGate(new Gate("G-3", false));

        for (int i=0; i<10; i++) {
            Flight flight = new Flight(actMediator, "F-00"+(i+1));
            flight.landAndTakeOff();
        }
    }

}
