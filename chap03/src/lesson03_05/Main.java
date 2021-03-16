package lesson03_05;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int maru = new java.util.Random().nextInt(6) + 1;
		int sankaku = new java.util.Random().nextInt(6) + 1;
		int kekka = Math.max(maru, sankaku);

		if (sankaku == maru) {
			System.out.println("引き分け");
		} else {
			System.out.println(maru + "と" + sankaku + "は、" + kekka
					+ "の方が大きいので、" + kekka + "の勝ち");
		}
	}

}
