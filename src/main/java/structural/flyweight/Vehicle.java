package structural.flyweight;

import java.util.Timer;
import java.util.TimerTask;

public class Vehicle {

    private String name;
    private final String task;
    private String type;
    private String color;
    private int speed;
    private boolean active;
    private int duration;

    public Vehicle(String name) {
        task = "Obstruct the racers";
        this.name = name;
    }

    public void setProperties(String type, String color, int speed, int duration) {
        this.type = type;
        this.color = color;
        this.speed = speed;
        this.duration = duration;
    }

    public boolean isActive() {
        return active;
    }

    public void addToTraffic() {
        System.out.println("->" + name + "-" + type + "-" + color + "-" + speed + "kmh-" + duration + "seconds");

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                active = false;
                System.out.println(name+"->OUT");
            }
        }, duration*1000);
        active = true;
    }
}
