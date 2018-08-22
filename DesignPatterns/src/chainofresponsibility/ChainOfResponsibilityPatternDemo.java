package chainofresponsibility;

public class ChainOfResponsibilityPatternDemo {
	public static void main(String[] args) {

		AbstractHandler handlerChain = getHandlerChain();

		handlerChain.handle(Request.REQUEST1);
		// Request REQUEST1 handled by Handler 1

		handlerChain.handle(Request.REQUEST2);
		// Request REQUEST2 handled by Handler 2

		handlerChain.handle(Request.REQUEST3);
		// Request REQUEST3 handled by Handler 3

		handlerChain.handle(Request.REQUEST4);
		// Request REQUEST4 can not be handled

	}

	private static AbstractHandler getHandlerChain() {
		AbstractHandler handler1 = new ConcreteHandler1();
		AbstractHandler handler2 = new ConcreteHandler2();
		AbstractHandler handler3 = new ConcreteHandler3();

		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);

		return handler1;
	}
}
