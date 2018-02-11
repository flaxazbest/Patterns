package creational.factorymethod;

public class Car implements Vehicle {

    Car() {
        /*
        * Constructor is protected,
        * clients needto use the factory method
        * */
    }

    @Override
    public void design() {
        System.out.println("Designing Car");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Car");
    }
}
