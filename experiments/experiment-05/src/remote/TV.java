package remote;

public class TV {
	String location;
	int channel;

	public TV(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("party.remote.TV is on");
	}

	public void off() {
		System.out.println("party.remote.TV is off");
	}

	public void setInputChannel() {
		this.channel = 3;
		System.out.println("Channel is set for VCR");
	}
}
