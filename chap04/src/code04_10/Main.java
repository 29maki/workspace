package code04_10;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = { 20, 30, 40, 50, 80 };
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("合計点" + sum);
		System.out.println("平均点" + avg);

		int max = 0;
		for (int i = 0; i < scores.length; i++) {
			max = Math.max(max, scores[i]);
		}
		System.out.println("最大値" + max);

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < scores.length; i++) {
			min = Math.min(min, scores[i]);
		}
		System.out.println("最小値" + min);

		int mul = 1;
		for (int i = 0; i < scores.length; i++) {
			mul *= scores[i];
		}

		System.out.println("すべての値を掛け算した値" + mul);
	}

}
