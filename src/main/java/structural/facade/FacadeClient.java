package structural.facade;

public class FacadeClient {

    public static void main(String[] args) {
        WeddingPlanner planner = new WeddingPlanner();
        planner.organize();
    }

}
