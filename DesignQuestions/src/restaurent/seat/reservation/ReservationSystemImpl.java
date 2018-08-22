package restaurent.seat.reservation;

import java.util.ArrayList;
import java.util.HashMap;

public class ReservationSystemImpl implements ReservationSystem {

	private static int TABLE_SIZE = 2;
	private HashMap<Person, Reservation> reservations;
	private ArrayList<Table> availableTables;
	private ArrayList<Table> occupiedTables;

	public ReservationSystemImpl() {
		// initializing tables
		int rows = 5;
		int cols = 5;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				Table t = new Table(i, j, 2);
				availableTables.add(t);
			}
		}

		// initializing other instance variables
		occupiedTables = new ArrayList<>();
		reservations = new HashMap<>();
	}

	@Override
	public void createReservation(String name, String mobile, int noofpeople, int startTime, int endTime) {
		int nooftablesrequired = noofpeople / TABLE_SIZE;
		if (availableTables.size() > noofpeople) {
			ArrayList<Table> tablesAllocated = new ArrayList<>();
			for (int i = 0; i < nooftablesrequired; i++) {
				tablesAllocated.add(availableTables.remove(0));
			}
			occupiedTables.addAll(tablesAllocated);

			// we can use person class for future use (to remember old
			// customers)
			Person reserver = new Person(name, mobile);
			Reservation reservation = new Reservation(reserver, startTime, endTime, tablesAllocated);
			reservations.put(reserver, reservation);
		} else {
			throw new RuntimeException("Table Not Available");
		}
	}

	@Override
	public ArrayList<Table> searchReservation(String name, String mobile) {
		Person person = new Person(name, mobile);
		Reservation reservation = reservations.get(person);
		if (reservation != null) {
			return reservation.getTablesAllocated();
		} else {
			throw new RuntimeException("Reservation not found");
		}
	}

	@Override
	public void completeReservation(String name, String mobile) {
		Person person = new Person(name, mobile);
		Reservation reservation = reservations.remove(person);
		if (reservation != null) {
			ArrayList<Table> tablesAllocated = reservation.getTablesAllocated();
			occupiedTables.removeAll(tablesAllocated);
			availableTables.addAll(tablesAllocated);
		} else {
			throw new RuntimeException("Reservation not found");
		}

	}

}
