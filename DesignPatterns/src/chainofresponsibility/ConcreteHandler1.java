package chainofresponsibility;

public class ConcreteHandler1 extends AbstractHandler {

	@Override
	public void handle(Request request) {
		if (request == Request.REQUEST1) {
			System.out.println("Request " + request + " handled by Handler 1");
		} else {
			nextHandler.handle(request);
		}
	}

}
