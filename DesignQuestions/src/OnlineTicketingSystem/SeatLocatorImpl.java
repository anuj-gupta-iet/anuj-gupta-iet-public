package OnlineTicketingSystem;

import java.util.Map;

public class SeatLocatorImpl implements SeatLocator {

	private Map<Category, Integer> audiAvailableSeatsMap;
	private int audiCateogrySeatArray[][];
	private static final int TOTAL_SEATS_PER_CATEGORY = 50;

	public SeatLocatorImpl() {
		super();
		audiCateogrySeatArray = new int[Audi.values().length][Category.values().length];
		for (int i = 0; i < audiCateogrySeatArray.length; i++) {
			for (int j = 0; j < audiCateogrySeatArray[i].length; j++) {
				audiCateogrySeatArray[i][j] = TOTAL_SEATS_PER_CATEGORY;
			}
		}
	}

	@Override
	public int getSeatAvailability(Audi audi, Category category) {
		if(audi==Audi.Audi1)
		return 0;
	}

	public static void main(String[] args) {
		SeatLocatorImpl ob = new SeatLocatorImpl();
	}

}
