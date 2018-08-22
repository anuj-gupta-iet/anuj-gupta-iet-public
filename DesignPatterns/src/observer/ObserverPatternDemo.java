package observer;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		/*
		 * Prints
		 * Binary String: 1111 
		 * Octal String: 17 
		 * Hex String: F
		 */
		System.out.println("Second state change: 10");
		subject.setState(10);
		/*
		 * Prints
		 * Binary String: 1010 
		 * Octal String: 12 
		 * Hex String: A
		 */
	}
}
