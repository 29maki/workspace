package rensyu_mondai;

public class Main {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("例外をcatchしました");
			System.out.println("-----ここから-----");
			e.printStackTrace();
			System.out.println("-----ここまで-----");
		}
	}

}
