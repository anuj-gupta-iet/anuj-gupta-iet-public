package trafficlightsystem;

public class TrafficLightContext {
	private TrafficLightState state;

	public void setState(TrafficLightState state) {
		this.state = state;
	}

	public void doStateAction() {
		this.state.doAction();
	}
}
