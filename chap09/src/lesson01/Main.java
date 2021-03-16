package lesson01;

public class Main {

	public static void main(String[] args) {
		Triangle t = new Triangle(30, 15);
		double menseki;
		menseki = t.teihen*t.takasa/2;
		System.out.println(menseki);
	}

}
