package behavioral.strategy2;

public class AxeWeaponType implements WeaponType {
    @Override
    public void hit() {
        System.out.println("Smash heads....");
    }
}
