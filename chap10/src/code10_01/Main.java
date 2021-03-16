package code10_01;

public class Main {

	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		sh.run();

		Hero h = new Hero();
		h.run();

		Matango m = new Matango();
		sh.attack(m); //先にひーろ-クラスの方を実行
	}

}
