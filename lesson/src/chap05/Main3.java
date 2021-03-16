package chap05;

public class Main3 {

	public static void main(String[] args) {
		double teihen = 10.0;
		double takasa = 5.0;
		double hankei = 5.0;
		calcTriangleArea(teihen, takasa);
		calcCircleArea(hankei);
	}

	public static double calcTriangleArea(double bottom, double height) {
		double menseki = bottom * height / 2;
		System.out.println("面積は" + menseki + "㎝");
		return menseki;
	}

	public static double calcCircleArea(double radius) {
		double en = radius * radius * 3.14;
		System.out.println("面積は" + en + "cm");
		return en;
	}
}
