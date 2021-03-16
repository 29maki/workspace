package lesson02;

public class Goods {
	private String name;
	private int price;

	public Goods(String name) { //read only
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
