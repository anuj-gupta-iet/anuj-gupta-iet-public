package restaurent;

import java.util.Set;

public class RestaurentDemo {
	public static void main(String[] args) {
		Restaurent restaurent = new RestaurentImpl();

		// order from Ist customer
		{
			Seat seat = restaurent.getSeat();
			System.out.println("Seat given to Ist customer: " + seat);
			// customer will first look to the menu and then place order
			Set<Item> items = restaurent.getMenu();
			System.out.println("Menu shown to Ist customer");
			System.out.println(items);
			Order order = restaurent.createOrder();
			restaurent.addItemToOrder(order, Item.DAL);
			restaurent.addItemToOrder(order, Item.ROTI);
			restaurent.bookAndServeOrder(order);
		}

		// order from 2nd customer
		{
			Seat seat = restaurent.getSeat();
			System.out.println("Seat given to 2nd customer: " + seat);
			Set<Item> items = restaurent.getMenu();
			System.out.println("Menu shown to 2nd customer");
			System.out.println(items);
			Order order = restaurent.createOrder();
			restaurent.addItemToOrder(order, Item.PANEER);
			restaurent.addItemToOrder(order, Item.ROTI);
			restaurent.bookAndServeOrder(order);
		}
	}
}
