package creational.abstractfactory;

public class CarEngine implements Engine {
    public void design() {
        System.out.println("Designing Car Engine");
    }

    public void manufacture() {
        System.out.println("Manufacturing Car Engine");
    }

    public void test() {
        System.out.println("Testing Car Engine");
    }
}
