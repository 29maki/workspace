package lesson04_05;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//乱数を5つ指定、２つかぶったらアタリ

		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new java.util.Random().nextInt(10);
			for (int j = 0; j < i; j++) {
				while (numbers[j] == numbers[i]) {
					numbers[i] = new java.util.Random().nextInt(10);
				}
			}
		}
		int count = 0;
		for (int i =0; i< 2; i++){
			System.out.println("一桁の数字を入力してください");
			int input = new java.util.Scanner(System.in).nextInt();
			for (int number : numbers) {
				count++;
			}
		}
		 switch (count) {
		 case 1:
			 System.out.println("アタリ");
			 break;
		 case 2:
			 System.out.println("全部アタリ");
		 }

	}

}
