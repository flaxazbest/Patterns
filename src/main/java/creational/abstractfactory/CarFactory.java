package creational.abstractfactory;

public class CarFactory extends Factory {
    public Engine getEngine() {
        return new CarEngine();
    }

    public Tyre getTyre() {
        return new CarTyre();
    }
}
