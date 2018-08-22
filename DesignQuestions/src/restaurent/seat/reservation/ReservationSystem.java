package restaurent.seat.reservation;

import java.util.ArrayList;

public interface ReservationSystem {

	void createReservation(String name, String mobile, int noofpeople, int startTime, int endTime);

	ArrayList<Table> searchReservation(String name, String mobile);

	void completeReservation(String name, String mobile);

}
