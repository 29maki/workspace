package lesson03_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int month =4;
		int money = 200000;
		while (month <= 8 && money <= 400000) {
		System.out.println(month + "月の給料日：所持金\\" + money);
		month++;
		money+=50000;
		}
	}

}
