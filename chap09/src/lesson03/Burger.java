//練習③
//ハンバーガーの情報を管理するバーガークラスを作成
//バーガークラスには以下の情報を持たせる
//「バーガー名、カロリー、原価」※すべてprivate修飾
//チーズバーガーを生成せよ※カロリーと原価は任意
//レタスバーガーを生成せよ
//チーズバーガーとレタスバーガーのカロリー合計を計算せよ

package lesson03;

public class Burger {
	private String burgerName; //〇
	private int cal; //〇 calorie
	private int cost; //〇

	public String getBurgerName() { //〇 getBurgerName
		return burgerName;
	}

	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	//	public void cheese() {
	//	this.name ="チーズバーガー";
	//	this.calorie =342;
	//	this.cost = 64;
	//	System.out.println(this.name+this.calorie+this.cost);
	//	}
	//
	//	public void lettuce() {
	//		this.name ="レタスバーガー";
	//		this.calorie =295;
	//		this.cost = 70;
	//		System.out.println(this.name+this.calorie+this.cost);
	//
	//	}
	//
	//	public void sum() {
	//
	//	}

}
