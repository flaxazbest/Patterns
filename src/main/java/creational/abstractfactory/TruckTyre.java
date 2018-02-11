package creational.abstractfactory;

public class TruckTyre implements Tyre {
    public void design() {
        System.out.println("Designing Truck Tyre");
    }

    public void manufacture() {
        System.out.println("Manufacturing Truck Tyre");
    }
}
