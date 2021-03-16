package lesson01;

public class SmallTrack extends Track {
	NormalCar c = new NormalCar();

	public void run() {
		c.run();
	}

	public void stop() {
		c.stop();
	}

	public void tumu() {
		System.out.println("荷物をやや積む");
	}

}
