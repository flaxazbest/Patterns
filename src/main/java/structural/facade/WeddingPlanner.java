package structural.facade;

import structural.facade.real.Hall;
import structural.facade.real.Photographer;
import structural.facade.real.Restaurant;
import structural.facade.real.Vehicle;

public class WeddingPlanner {

    private Hall hall;
    private Restaurant restaurant;
    private Photographer photographer;
    private Vehicle vehicle;

    public WeddingPlanner() {
        hall = new Hall();
        restaurant = new Restaurant();
        photographer = new Photographer();
        vehicle = new Vehicle();
    }

    public void organize() {
        hall.book();
        restaurant.placeOrder();
        photographer.book();
        vehicle.reserve();
    }

}
