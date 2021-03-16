package lesson02;

public class Main {

	public static void main(String[] args) {
		//		本日の練習問題③
		//		「チーズバーガー、てりやきバーガー、ライスバーガー」には、
		//		それぞれ「カロリー」があります。
		//		これらのカロリーの合計を、1度のメソッド実行で行って下さい。
		//		ただし、全てのフィールドはprivateで修飾する事。

		Calorie cheese = new Cheese();
		cheese.setCal(354);
		Calorie teriyaki = new Teriyaki();
		teriyaki.setCal(429);
		Calorie rice = new Rice();
		rice.setCal(384);

		Calorie[] array = {cheese, teriyaki, rice};
		int sum = 0;
		for (Calorie c : array) {
			sum += c.getCal();
		}
		System.out.println(sum);

	}

}
