package chap02;

public class Plus {

	public static void main(String[] args) {

		double tanka = 100;
		double kosuu = 10;
		double tax = 0.08;

		System.out.println("商品単価(税抜):" + (int)tanka);
		System.out.println("個数:" + (int)kosuu);
		System.out.println("消費税:" + (int)tax);
		System.out.println("----------------");

		double taxPrice = tanka * kosuu * (tax + 1.0);
		System.out.println("金額(税込):" + (int)taxPrice);
	}

}
