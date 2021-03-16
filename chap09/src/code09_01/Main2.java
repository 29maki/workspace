package code09_01;

public class Main2 {
	public static void main(String[] args) {
		Hero h1 = new Hero(); //ヒーローを生み出す
		h1.name = "ミナト"; //初期値をセット
		h1.hp = 100;
		Hero h2 = new Hero(); //ヒーロー2人目を生み出す
		h2.name = "アサカ"; //初期値をセット
		h2.hp = 100;
		Wizard w = new Wizard(); //ウィザードを生み出す
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1); //ウィザードの持っているヒールメソッドを使う
		w.heal(h2); //住所(h2.h1)の情報を引数として渡している
		w.heal(h2);
	}
}
