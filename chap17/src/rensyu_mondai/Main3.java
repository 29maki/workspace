package rensyu_mondai;

public class Main3 {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("例外あり");
		}
	}

}
