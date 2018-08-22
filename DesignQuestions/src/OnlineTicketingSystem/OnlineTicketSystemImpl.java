package OnlineTicketingSystem;

import java.util.List;
import java.util.Map;

public class OnlineTicketSystemImpl implements OnlineTicketSystem {

	private AudiLocator audiLocator;
	private SeatLocator seatLocator;
	private Map<String, List<Audi>> movieHM;
	private Map<Category, Integer> audiHM;
	
	public OnlineTicketSystemImpl() {
		this.audiLocator = new AudiLocatorImpl();
		this.seatLocator = new SeatLocatorImpl();
	}

	@Override
	public Ticket bookTicket(String movieName, Category category) {
		List<Audi> audis = audiLocator.getAudi(movieName);
		for (Audi audi : audis) {
			int noofseatsavailable = seatLocator.getSeatAvailability(audi, category);
			if (noofseatsavailable > 0) {
				Ticket ticket = new Ticket(movieName, audi, category);
				return ticket;
			}
		}
		throw new RuntimeException();
	}

	@Override
	public void cancelTicket(Ticket ticket) {
		
	}

}
