package lesson05_01;

public class Main {
	//①長方形の面積を計算する「chouhoukeiArea()」を定義
	//同メソッド内で任意の縦・横の値を決め面積を出力しなさい。

	//	public static void chouhoukeiArea() {
	//		int tate = 4;
	//		int yoko = 5;
	//		int menseki = tate * yoko;
	//		System.out.println(menseki);
	//
	//	}

	//②長方形の面積を計算する「chouhoukeiArea()」を定義
	//同メソッドから、面積を出力。ただし、縦横の値はメインメソッドから渡すこと

//	public static void main(String[] args) {
//		chouhoukeiArea(10, 20);
//	}
//
//	public static void chouhoukeiArea(int tate, int yoko) {
//		int menseki = tate * yoko;
//		System.out.println(menseki);
//
//	}

	//③三角形の面積を計算する「sankakuArea()」を定義。
	//また、面積を出力する「pointArea()」を定義。
	//mainメソッドから底辺・高さを渡し、最後はprintArea()から出力


	public static void sankakuArea(double teihen, double takasa) {
		double menseki = teihen * takasa / 2;
		pointArea(menseki);
	}

	public static void pointArea(double menseki) {
		System.out.println(menseki);
	}

	public static void main(String[] args) {
		sankakuArea(1,5);
	}


















}
