package kaiin;

public class Normal implements Member {
	private int id;
	private String name;
	private int monthlyPrice = 5000;

	@Override
	public String kind() {
		return this.name;
	}

	@Override
	public int payment() {
		double tax =1.08;
		this.monthlyPrice *= (int)tax;
		return this.monthlyPrice;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMonthlyPrice() {
		return monthlyPrice;
	}



}
