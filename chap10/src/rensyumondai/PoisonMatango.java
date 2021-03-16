package rensyumondai;

public class PoisonMatango extends Matango {
	int count = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	//	PoisonMatango pm = new PoisonMatango('A');

	public void attack(Hero h) {
		super.attack(h);

		if (this.count > 0) {    //(this.count != 0)とか
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = h.hp / 5;
			hp -= damage;
			System.out.println(damage + "ポイントのダメージ");
			this.count--;
		}
	}
}
