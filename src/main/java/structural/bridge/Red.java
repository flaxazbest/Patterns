package structural.bridge;

import structural.bridge.Color;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Red");
    }
}
