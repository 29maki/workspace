package code14_09;

import java.util.Random;

public class Hero {
	String name;
	int hp;
	static int money; //静的フィールド

	public static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
		//newしなくても使える
		//staticなメソッドだから


		//０以上１未満の数値を生み出して１０００倍する
		//→０以上１０００未満の数字
		//int型にキャストして少数点以下を切り捨てる
		//キャストの優先順位の方が高いのでMathの方にかっこを忘れないようにしようね
		Hero.money = new Random().nextInt(1000);
		//newして使う、使い捨て
		//staticでないクラスだから
	}
}
