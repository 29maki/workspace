package lesson04_04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numbers =new int [3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new java.util.Random().nextInt(10);
			for (int j =0; j<i; j++) {
				numbers[j] = new java.util.Random().nextInt(10);
				while (i == j) {
					numbers[i] = new java.util.Random().nextInt(10);
				}
			}
		}


		System.out.println("一桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int i : numbers) {
			if (input == i) {
				System.out.println("アタリ！");
			}
		}







//		int[] numbers = new int [3];
//
//		for (int i = 0; i < numbers.length; i++) {
//		numbers[i] = new java.util.Random().nextInt(10);
//		if (numbers[i] ==numbers[i]) {
//				for (int j = 0; j < numbers.length; j++) {
//					numbers[j] = new java.util.Random().nextInt(10);
//
//					if (numbers[i] ==numbers[j]) {
//						int k = 0;
//							numbers[k] = new java.util.Random().nextInt(10);
//					System.out.println(numbers[i] +numbers[j] +numbers[k]);
//				}
//
//				System.out.println("一桁の数字を入力してください");
//				int input = new java.util.Scanner(System.in).nextInt();
//				for (int l : numbers) {
//					if (input == l) {
//						System.out.println("アタリ！");
//					}
//				}
//					}
//		}
//		}
	}

}
