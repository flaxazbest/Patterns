package creational.factorymethod;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType)
        throws VehicleTypeNotFoundException {

        if (vehicleType == null)
            return null;
        Vehicle vehicle = null;
        switch (vehicleType) {
            case "car":
                vehicle = new Car();
                break;
            case "truck":
                vehicle = new Truck();
                break;
            case "moto":
                vehicle = new Moto();
                break;
            default:
                throw new VehicleTypeNotFoundException();
        }
        return vehicle;
    }
}
