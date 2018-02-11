package creational.abstractfactory;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String vehicleType = in.nextLine().toLowerCase();

        /* Get the factory instance */
        Factory factory;
        try {
            factory = Factory.getFactory(vehicleType);

            /* Get the Engine from the factory */
            Engine engine = factory.getEngine();
            engine.design();
            engine.manufacture();
            engine.test();

            /* Get the Tyre from thew factory */
            Tyre tyre = factory.getTyre();
            tyre.design();
            tyre.manufacture();

        } catch (UnknownVehicleException e) {
            System.err.println("Invalid vehicle type entered!");
        }

        in.close();
    }

}
