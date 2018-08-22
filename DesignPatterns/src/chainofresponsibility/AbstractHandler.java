package chainofresponsibility;

public abstract class AbstractHandler {
	protected AbstractHandler nextHandler;

	public void setNextHandler(AbstractHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public abstract void handle(Request request);
}
