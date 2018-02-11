package creational.factorymethod;

import java.util.Scanner;

public class FactoryMethodClient {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String vehicleType = in.nextLine();
        /* Create factory instance */
        VehicleFactory factory = new VehicleFactory();

        try {
            // create an appropriate vehicle based on the input
            Vehicle vehicle = factory.getVehicle(vehicleType);
            vehicle.design();
            vehicle.manufacture();
        } catch (VehicleTypeNotFoundException e) {
            System.out.println("Invalid vehicle type entered!");
        }

    }

}
