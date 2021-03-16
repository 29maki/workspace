package chap02;

public class Main {

	public static void main(String[] args) {
		int tanka = 100;
		int kosuu = 10;
		double tax = tanka * 0.08;
		double price = tanka * kosuu + tax;
		System.out.println("商品単価(税抜)：" + tanka);
		System.out.println("個数：" + kosuu);
		System.out.println("消費税：" + tax);
		System.out.println("--------------------");
		System.out.println("金額(税込)：" + price);

	}

}
