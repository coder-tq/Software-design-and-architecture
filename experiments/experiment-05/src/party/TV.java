package party;

public class TV {
	String location;
	int channel;

	public TV(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " party.remote.TV is on");
	}

	public void off() {
		System.out.println(location + " party.remote.TV is off");
	}

	public void setInputChannel() {
		this.channel = 3;
		System.out.println(location + " party.remote.TV channel is set for DVD");
	}
}
