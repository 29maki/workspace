package lesson01;

public abstract class Car {
	String name;
	int price;
	double fuelEconomy;

	public abstract void run();

	public abstract void stop();

	public Car() {
		if (this.price < 100000) {
			throw new IllegalArgumentException("10万円以下の値段は設定できません");
		}
	}
}
