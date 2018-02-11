package creational.builder;

public class HouseBuildDirector {
    private HouseBuilder builder;

    public HouseBuildDirector(final HouseBuilder builder) {
        this.builder = builder;
    }

    public House construct() {
        return builder.buildFloor().buildWall().buildRoof().build();
    }
}
