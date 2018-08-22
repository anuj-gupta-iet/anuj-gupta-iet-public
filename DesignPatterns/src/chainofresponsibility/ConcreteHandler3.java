package chainofresponsibility;

public class ConcreteHandler3 extends AbstractHandler {

	@Override
	public void handle(Request request) {
		if (request == Request.REQUEST3) {
			System.out.println("Request " + request + " handled by Handler 3");
		} else {
			System.out.println("Resuest " + request + " can not be handled");
		}
	}

}
