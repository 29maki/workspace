package lesson04_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//		int[][] scores = new int [2][3];
		//		scores[0][0] = 40;
		//		scores[0][1] = 50;
		//		scores[0][2] = 60;
		//		scores[1][0] = 80;
		//		scores[1][1] = 60;
		//		scores[1][2] = 70;
		//		System.out.println(scores[1][1]);

		int[][] scores = { { 40, 50, 60, 90 }, { 80, 60, 70 } };
		System.out.println(scores.length);
		System.out.println(scores[0].length);

		//数字を連続で表示させる

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println(scores[i][j]);
			}
		}

		//拡張for文
		for (int[] inner : scores) {
			for (int value : inner) {
				System.out.println(value);
			}
		}

	}

}
