package lesson03_06;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("サイコロの目を当ててください");
		int input = new java.util.Scanner(System.in).nextInt();
		int saikoro = new java.util.Random().nextInt(6);
		saikoro++;
		System.out.println(saikoro);

		if (saikoro == input) {
			System.out.println("ビンゴ");
		}
		else {
			System.out.println("はずれ；");
		}
	}

}
