package code02_18;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int maru = new java.util.Random().nextInt(6);
		maru++;
		int sankaku = new java.util.Random().nextInt(6)+1;
		int kekka = Math.max(maru, sankaku);
		System.out.println(maru + "と" +sankaku+"は、" + kekka
				+"の方が大きいので、" + kekka + "の勝ち");
	}

}
