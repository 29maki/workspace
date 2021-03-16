package rensyu_mondai2;

import java.util.Random;

public class Cleric {

	String name;
	public static final int MAX_HP = 50;
	//publicをつけるとどこからでもアクセスできるようになる
	int hp = MAX_HP;
	public static final int MAX_MP = 10;
	int mp = MAX_MP;

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを使った！");
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println("HPが最大まで回復した！");
	}

	public int pray(int sec) {
		int recover = sec + new Random().nextInt(3);
		int recoverActual;
		if (this.mp + recover > MAX_MP) {
			recoverActual = MAX_MP - this.mp;
		} else {
			recoverActual = recover;
		}
		this.mp += recoverActual;
		System.out.println("mpが" + recoverActual + "回復した");
		return recoverActual;
	}

}
