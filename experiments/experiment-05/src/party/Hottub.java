package party;

public class Hottub {
	boolean on;
	int temperature;

	public Hottub() {
	}

	public void on() {
		on = true;
	}

	public void off() {
		on = false;
	}

	public void circulate() {
		if (on) {
			System.out.println("party.remote.Hottub is bubbling!");
		}
	}

	public void jetsOn() {
		if (on) {
			System.out.println("party.remote.Hottub jets are on");
		}
	}

	public void jetsOff() {
		if (on) {
			System.out.println("party.remote.Hottub jets are off");
		}
	}

	public void setTemperature(int temperature) {
		if (temperature > this.temperature) {
			System.out.println("party.remote.Hottub is heating to a steaming " + temperature + " degrees");
		}
		else {
			System.out.println("party.remote.Hottub is cooling to " + temperature + " degrees");
		}
		this.temperature = temperature;
	}
}
