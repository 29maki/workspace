package lesson03_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int month =1;
		int money = 50000;
		while (month <= 5 && money <= 250000) {
		System.out.println(month + "月の給料日：所持金\\" + money);
		month++;
		money+=50000;
		}
	}

}
