package lesson04_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//		int [] points = new int [4];
		//		double [] weights = new double[5];
		//		boolean [] answers = new boolean [3];
		//		String [] names = new String [3];
		//
		//		//for文
		//		int[] moneyList = { 121902, 8302, 55100 };
		//		for (int i = 0; i < moneyList.length; i++) {
		//			System.out.println(moneyList[i]);
		//		}
		//		//拡張for文
		//		for (int value : moneyList) {
		//			System.out.println(value);
		//		}

		//		int[] counts =null;
		//		float[] heights = {171.3F,175.0F};
		//		System.out.println(counts[1]); //NullPointerException
		//		System.out.println(heights[2]); //ArrayIndexOutOfBounsException

		int[] numbers = { 3, 4, 9 };
		System.out.println("一桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int i : numbers) {
			if (input == i) {
				System.out.println("アタリ！");
			}
		}

	}

}
