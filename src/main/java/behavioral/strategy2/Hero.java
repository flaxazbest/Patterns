package behavioral.strategy2;

public class Hero {
    private WeaponType currentWeaponType;

    public Hero(WeaponType currentStrategy) {
        this.currentWeaponType = currentStrategy;
    }

    public void punch() {
        currentWeaponType.hit();
    }

    public void setCurrentWeaponType(WeaponType currentWeaponType) {
        this.currentWeaponType = currentWeaponType;
    }
}
