package lesson01;

public abstract class Track extends Car {
	public void run() {
		System.out.println("ゴトゴト走る");
	}

	public void stop() {
		System.out.println("ゴトゴト停まる");
	}

	public abstract void tumu();
}
