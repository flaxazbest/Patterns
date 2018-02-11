package creational.factorymethod;

public class Moto implements Vehicle {

    Moto() {
        /*
        * Constructor is protected,
        * clients needto use the factory method
        * */
    }

    @Override
    public void design() {
        System.out.println("Designing Motorcycle");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Motorcycle");
    }
}
