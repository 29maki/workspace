package code09_01;

public class Wizard {
	String name;
	int hp;

	public void heal(Hero h) { //ヒーロー型ｈが引数になっている（値を渡さなければいけない）
		h.hp += 10;
		System.out.println(h.name + "のHPを１０回復した！");
		System.out.println("現在のHPは" + h.hp);
	}
}
