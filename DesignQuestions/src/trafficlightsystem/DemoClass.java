package trafficlightsystem;

public class DemoClass {
	public static void main(String[] args) throws InterruptedException {
		TrafficLightContext context = new TrafficLightContext();

		TrafficLightState redState = new RedTrafficLightState();
		TrafficLightState yellowState = new YellowTrafficLightState();
		TrafficLightState greenState = new GreenTrafficLightState();

		while (true) {
			context.setState(redState);
			context.doStateAction();// traffic light turned to red

			Thread.sleep(1000); // delay

			context.setState(yellowState);
			context.doStateAction(); // traffic light turned to yellow

			Thread.sleep(1000); // delay

			context.setState(greenState);
			context.doStateAction();// traffic light turned to green

			Thread.sleep(1000); // delay
		}
	}
}
