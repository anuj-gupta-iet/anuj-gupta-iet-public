package chainofresponsibility;

public class ConcreteHandler2 extends AbstractHandler {

	@Override
	public void handle(Request request) {
		if (request == Request.REQUEST2) {
			System.out.println("Request " + request + " handled by Handler 2");
		} else {
			nextHandler.handle(request);
		}
	}

}
