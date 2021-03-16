//①三角形の面積を計算する三角クラスを定義
//三角クラスはフィールドに「底辺」と「高さ」の値をもつ
//メソッドはない
//次に三角クラスのインスタンスを生成し、
//それと同時に「底辺」「高さ」を指定
//mainメソッドから面積を表示させてください

package lesson01; //①

public class Triangle {
	double teihen;
	double takasa;
	public Triangle(double takasa, double teihen) { //コンストラクタを生成
		this.takasa = takasa;
		this.teihen = teihen;
	}
}
