package structural.flyweight;

import java.util.LinkedList;
import java.util.List;

public class VehicleFactory {

    private List<Vehicle> pool = new LinkedList<>();

    public VehicleFactory() {
        for (int i=0; i<5; i++) {
            pool.add(new Vehicle("v"+(i+1)));
        }
    }

    public Vehicle getVehicle(String type, String color, int speed, int duration) {
        for (Vehicle v: pool) {
            if (!v.isActive()) {
                v.setProperties(type, color, speed, duration);
                return v;
            }
        }
        return null;
    }
}
