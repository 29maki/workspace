package lesson01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//		本日の練習問題①
		//
		//		「猫クラス、犬クラス、鳥クラス」を作成して下さい。
		//		メソッドの実行文を1度しか書かずに、以下の実行結果を得て下さい。
		//		■実行結果■
		//		猫が鳴く「みゃーみゃー」
		//		犬が鳴く「わんわん」
		//		鳥が鳴く「ぎーよぎーよ」

		Animals ct = new Cat();
		Animals dg = new Dog();
		Animals bd = new Bird();
		Animals[] a = { ct, dg, bd };
		for (Animals ani : a) {
			ani.nakigoe();
		}

		PetHotel ph = new PetHotel();
		ph.service(a);
	}

}
