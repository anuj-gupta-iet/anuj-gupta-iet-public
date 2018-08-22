package OnlineTicketingSystem;

public class Ticket {
	private String movieName;
	private Audi audi;
	private String seatNumber;
	private Category category;
	public Ticket(String movieName, Audi audi, Category category) {
		super();
		this.movieName = movieName;
		this.audi = audi;
		this.category = category;
	}
	
	
}
