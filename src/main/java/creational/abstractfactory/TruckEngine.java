package creational.abstractfactory;

public class TruckEngine implements Engine {
    public void design() {
        System.out.println("Designing Truck Engine");
    }

    public void manufacture() {
        System.out.println("Manufacturing Truck Engine");
    }

    public void test() {
        System.out.println("Testing Truck Engine");
    }
}
