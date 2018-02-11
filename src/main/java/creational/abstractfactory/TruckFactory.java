package creational.abstractfactory;

public class TruckFactory extends Factory {
    public Engine getEngine() {
        return new TruckEngine();
    }

    public Tyre getTyre() {
        return new TruckTyre();
    }
}
