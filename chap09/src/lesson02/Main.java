package lesson02;
//②三角形の面積を計算する三角クラスを定義
//三角クラスはフィールドに「底辺」と「高さ」の値をもつ
//メソッドに面積を計算するメソッドを持つ
//次に三角クラスのインスタンスを生成し、
//それと同時に「底辺」「高さ」を指定
//mainメソッドから面積を表示させてください

public class Main {

	public static void main(String[] args) {
		Triangle t = new Triangle(30, 15);
		System.out.println(t.menseki());
	}

}
