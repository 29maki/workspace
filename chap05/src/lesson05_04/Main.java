package lesson05_04;

//練習５－４
public class Main {
	public static void main(String[] args) {
		double menseki = calcTriangleArea(10.0, 5.0);
		System.out.println("面積は" + menseki + "平方㎝");

		double en = calcCircleArea(5.0);
		System.out.println("面積は" + en + "平方㎝");
		
		//system.out.println(String.format("面積は%.1f㎠" , en));
	}

	public static double calcTriangleArea(double bottom, double height) {
		double menseki = (bottom * height) / 2;
		return menseki;
	}

	public static double calcCircleArea(double radius) {
		double en = radius * radius * 3.14;
		//Math.PI * Math.pow(radius, 2);	でも可
		return en;
	}
}
