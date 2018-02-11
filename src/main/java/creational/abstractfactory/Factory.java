package creational.abstractfactory;

public abstract class Factory {
    /*Singelton factory objects*/
    private static Factory carFactory = null;
    private static Factory truckFactory = null;

    public abstract Engine getEngine();
    public abstract Tyre getTyre();

    /*
     * This is the factory method exposed to the client.
     * Client requests for the factory instance by passing the type.
     * Client does not need to know about which & how
     * object is created internally
     */
    public static Factory getFactory(String vehicleType)
        throws UnknownVehicleException {

        if (vehicleType == null) {
            return null;
        }

        Factory factory = null;
        switch (vehicleType) {
            case "car":
                if (carFactory == null)
                    carFactory = new CarFactory();
                factory = carFactory;
                break;
            case "truck":
                if (truckFactory == null)
                    truckFactory = new TruckFactory();
                factory = truckFactory;
                break;
            default:
                throw new UnknownVehicleException();
        }

        return factory;
    }
}
