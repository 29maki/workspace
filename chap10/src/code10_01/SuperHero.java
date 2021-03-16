package code10_01;

public class SuperHero extends Hero {
	boolean flying;

	public SuperHero() {
		super();
		//↑省略しても動く.コンストラクタ内にしか書けない（メソッド×）
		//コンストラクタの先頭にはsuper()の;記述が必要。
		//書いてない場合は省略しているものとみなして親コンストラクタ(hero)を呼び出す
		//親コンストラクタが引数を持っている場合は受け渡しに必要な引数をいれる
		System.out.println("SuperHeroのコンストラクタが動作");
	}

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

	public void run() {
		System.out.println(this.name + "は撤退した");
	}

	public void attack(Matango m) {
		super.attack(m); //親クラスのアタックメソッド、違う名前のメソッドも呼べるよ
		if (this.flying) { //カプセル化されているとできない
			super.attack(m);
		}
	}

}
