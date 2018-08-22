package trafficlightsystem;

public class GreenTrafficLightState implements TrafficLightState{
	@Override
	public void doAction() {
		System.out.println("Green Light");
	}
}
