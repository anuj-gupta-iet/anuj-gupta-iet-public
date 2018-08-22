package restaurent.seat.reservation;

import java.util.ArrayList;

public class RestaurentSeatReservationDemo {
	public static void main(String[] args) {
		ReservationSystem restaurent = new ReservationSystemImpl();
		// 24 hr format start time
		int startTime = 10;
		int endTime = 12;
		String name = "Anuj";
		String mobile = "7503931534";
		int noofpeople = 3;
		restaurent.createReservation(name, mobile, noofpeople, startTime, endTime);
		ArrayList<Table> table = restaurent.searchReservation(name, mobile);
		restaurent.completeReservation(name, mobile);
	}
}
