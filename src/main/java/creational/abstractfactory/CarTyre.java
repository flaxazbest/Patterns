package creational.abstractfactory;

public class CarTyre implements Tyre {
    public void design() {
        System.out.println("Designing Car Tyre");
    }

    public void manufacture() {
        System.out.println("Manufacturing Car Tyre");
    }
}
