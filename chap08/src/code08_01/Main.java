package code08_01;

public class Main {

	public static void main(String[] args) {
		//勇者を作成
		Hero h = new Hero();

		//フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を呼び出しました！");

		//勇者のメソッドを呼び出してゆく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		
	}

}
