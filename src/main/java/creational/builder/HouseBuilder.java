package creational.builder;

public interface HouseBuilder {
    public HouseBuilder buildFloor();
    public HouseBuilder buildWall();
    public HouseBuilder buildRoof();
    public House build();
}
