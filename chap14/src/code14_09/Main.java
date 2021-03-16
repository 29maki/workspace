package code14_09;

public class Main {

	public static void main(String[] args) {
		//Hero.money = 100;
		Hero.setRandomMoney();
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		System.out.println(h1.hp); //インスタンスh1の箱
		System.out.println(Hero.money); //クラスHeroの箱
		System.out.println(h1.money);
		//h1.money = 300;
		h1.setRandomMoney();
		System.out.println(h2.money);
		System.out.println(Math.PI);
		//↑public static finalがついて定数の例
	    //定数フィールド、newしなくても使えて便利
	}

}
