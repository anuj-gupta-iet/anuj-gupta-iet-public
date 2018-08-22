package trafficlightsystem;

public class RedTrafficLightState implements TrafficLightState{
	@Override
	public void doAction() {
		System.out.println("Red Light");
	}
}
