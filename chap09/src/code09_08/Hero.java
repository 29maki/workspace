package code09_08;

public class Hero {
	String name;
	int hp;

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
	}

	public Hero(String name) {
		this.hp = 100; //コード9－8、hpフィールドを100で初期化
		this.name = name;
	}

	public Hero() {
		//		this.hp = 100;
		//		this.name = "ダミー";
		this("ダミー");
	}

}
