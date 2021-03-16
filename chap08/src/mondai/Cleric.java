package mondai;

import java.util.Random;

public class Cleric {

	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10; //int hp = MAX_HP;も可。変更があったとき一回ですむ
	final int MAX_MP = 10; //int mp = MAX_MP その場合は先に定数を宣言する

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを使った！");
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println("HPが最大まで回復した！");
	}

	public int pray(int sec) {
		int recover = sec + new Random().nextInt(3);
		int recoverActual;
		if(this.mp + recover >this.MAX_MP) {
			recoverActual = this.MAX_MP - this.mp;
		} else {
			recoverActual = recover;
		}
		this.mp += recoverActual;
		System.out.println("mpが"+recoverActual +"回復した");
		return recoverActual;
	}
//      ↓自分の回答、間違えた
//		System.out.println(this.name + "は" + sec + "秒祈った！");
//		int point = new java.util.Random().nextInt(3) + sec;
//		this.mp += point;
//		if (mp > MAX_MP) {
//			int p = this.mp += p;
//			System.out.println(p + "回復した！");
//			return p;
//		}
//		System.out.println("mpが" + point + "回復した！");
//
//		return point;

}
