package restaurent;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Item> items;

	public Order() {
		items = new ArrayList<>();
	}

	public void addItem(Item item) {
		items.add(item);
	}
}
