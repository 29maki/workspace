package code09_01;

public class Hero {
	String name;
	int hp;
	Sword sword; //勇者が装備している剣の情報

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に" + this.sword.damage + "ポイントのダメージ");
	}
}
