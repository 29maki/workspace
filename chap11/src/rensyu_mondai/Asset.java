package rensyu_mondai;

public abstract class Asset {
	String name;
	int price;

	public Asset(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

}
