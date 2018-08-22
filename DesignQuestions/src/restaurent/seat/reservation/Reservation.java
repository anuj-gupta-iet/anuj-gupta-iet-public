package restaurent.seat.reservation;

import java.util.ArrayList;

public class Reservation {

	private Person person;
	private int startTime;
	private int endTime;
	ArrayList<Table> tablesAllocated;
	public Reservation(Person person, int startTime, int endTime, ArrayList<Table> tablesAllocated) {
		super();
		this.person = person;
		this.startTime = startTime;
		this.endTime = endTime;
		this.tablesAllocated = tablesAllocated;
	}
	public ArrayList<Table> getTablesAllocated() {
		return tablesAllocated;
	}
	public void setTablesAllocated(ArrayList<Table> tablesAllocated) {
		this.tablesAllocated = tablesAllocated;
	}
	

}
