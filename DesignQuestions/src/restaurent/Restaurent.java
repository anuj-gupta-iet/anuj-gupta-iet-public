package restaurent;

import java.util.Set;

public interface Restaurent {
	Seat getSeat();

	Set<Item> getMenu();

	Order createOrder();

	void addItemToOrder(Order order, Item item);

	void bookAndServeOrder(Order order);

}
