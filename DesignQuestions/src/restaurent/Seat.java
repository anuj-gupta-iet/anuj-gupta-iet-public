package restaurent;

public class Seat implements Comparable<Seat> {

	private int seatNumber;
	private boolean available;

	public Seat(int seatNumber, boolean available) {
		this.seatNumber = seatNumber;
		this.available = available;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public int compareTo(Seat o) {
		if (o.isAvailable()) {
			return 0;
		} else {
			return 1;
		}
	}
}
