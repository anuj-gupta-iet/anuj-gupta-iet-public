package OnlineTicketingSystem;

public interface OnlineTicketSystem {
	Ticket bookTicket(String movieName, Category category);

	void cancelTicket(Ticket ticket);
}
