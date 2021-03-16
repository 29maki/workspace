package lesson01;

public class Wand {
	private String name;
	private double power;

	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException("3文字以上で指定してください");
		}
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPower(double power) {
		this.power = power;
		if (power < 0.5 || power > 100) {
			throw new IllegalArgumentException("値ダメです");
		}
	}

	public double getPower() {
		return this.power;
	}

}