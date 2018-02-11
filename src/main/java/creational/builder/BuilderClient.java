package creational.builder;


public class BuilderClient {

    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();
        HouseBuildDirector carBuildDirector = new HouseBuildDirector(builder);
        System.out.println(carBuildDirector.construct());

        builder = new WoodenHouseBuilder();
        carBuildDirector = new HouseBuildDirector(builder);
        System.out.println(carBuildDirector.construct());

    }

}
