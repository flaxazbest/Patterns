package behavioral.strategy2;

public class StrategyClient {

    public static void main(String[] args) {

        WeaponType sword = new SwordWeaponType();
        Hero hero = new Hero(sword);
        hero.punch();
        WeaponType bow = new BowWeaponType();
        hero.setCurrentWeaponType(bow);
        hero.punch();
        hero.setCurrentWeaponType(new AxeWeaponType());
        hero.punch();

    }

}
