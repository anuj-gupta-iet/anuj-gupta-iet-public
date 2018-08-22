package trafficlightsystem;

public class YellowTrafficLightState implements TrafficLightState{
	@Override
	public void doAction() {
		System.out.println("Yellow Light");
	}
}
