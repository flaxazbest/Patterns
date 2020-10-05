package behavioral.strategy2;

public class SwordWeaponType implements WeaponType {
    @Override
    public void hit() {
        System.out.println("Go to front line");
    }
}
