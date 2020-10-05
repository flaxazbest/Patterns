package behavioral.strategy2;

public class BowWeaponType implements WeaponType {
    @Override
    public void hit() {
        System.out.println("Hide on tree");
    }
}
