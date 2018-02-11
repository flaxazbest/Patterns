package structural.flyweight;

import java.util.Random;

public class FlyWeightClient {

    static Random r = new Random();

    private static String[] types = {"bus", "truck", "car"};
    private static String[] colors = {"red", "green", "blue"};
    private static int[] speeds = {50, 30, 80};

    public static String getRandType() {
        return types[r.nextInt(types.length)];
    }

    public static String getRandColor() {
        return colors[r.nextInt(colors.length)];
    }

    public static int getRandSpeed() {
        return speeds[r.nextInt(speeds.length)];
    }

    public static void main(String[] args) throws InterruptedException {
        VehicleFactory factory = new VehicleFactory();
        for (int i=0; i<20; i++) {
            Vehicle v = factory.getVehicle(
                    getRandType(),
                    getRandColor(),
                    getRandSpeed(),
                    r.nextInt(5)+1
            );
            if (v != null) {
                System.out.println("vehicle" + (i+1));
                v.addToTraffic();
            }
            else {
                i--;
                Thread.sleep(1000);
            }
        }
    }
}
