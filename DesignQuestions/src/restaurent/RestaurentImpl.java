package restaurent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RestaurentImpl implements Restaurent {

	private List<Seat> seats;
	private Map<Item, Integer> menu;
	private Kitchen kitchen;

	public RestaurentImpl() {
		// initializing seats, we can use a sorting algorithm (heap sort) so
		// that whenever a
		// seat is allocated to a person it will be at the bottom of the
		// collection and available seats will be at the top always
		seats = new ArrayList<>(20);
		for (int i = 0; i < 20; i++) {
			seats.add(new Seat(i, true));
		}
		// initializing menu, menu will be a hashmap with key as menu item and
		// value as menu item availability count
		menu = new HashMap<>();
		menu.put(Item.DAL, 5);
		menu.put(Item.PANEER, 5);
		menu.put(Item.RICE, 5);
		menu.put(Item.ROTI, 5);
		menu.put(Item.SABZI, 5);

	}

	@Override
	public Seat getSeat() {
		// get available seats from the top of seats collection
		for (Seat seat : seats) {
			if (seat.isAvailable()) {
				seat.setAvailable(false);
				return seat;
			}
		}
		throw new RuntimeException("Seat Not Available");
	}

	@Override
	public Set<Item> getMenu() {
		Set<Item> availableItems = new HashSet<>();
		for (Entry<Item, Integer> entry : menu.entrySet()) {
			if (entry.getValue() > 0) {
				availableItems.add(entry.getKey());
			}
		}
		return availableItems;
	}

	@Override
	public Order createOrder() {
		return new Order();
	}

	@Override
	public void addItemToOrder(Order order, Item item) {
		synchronized (menu) {
			int i = menu.get(item);
			if (i > 0) {
				menu.put(item, i - 1);
				order.addItem(item);
			} else {
				throw new RuntimeException("Item not available");
			}
		}
	}

	@Override
	public void bookAndServeOrder(Order order) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				kitchen.requestOrder(order);
				while (!kitchen.isOrderReady(order)) {
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
					}
				}
				serveOrder(kitchen.getOrder(order));
			}
		}).start();
	}

	private void serveOrder(Order order) {
		// .. order served
		System.out.println(order + " : Served");
	}

}
