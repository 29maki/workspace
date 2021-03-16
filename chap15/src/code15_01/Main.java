package code15_01;

public class Main {

	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "     ";
		String s5 = "　　　　　";
		String s6 = "";

		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です");
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}

		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s1.isEmpty());
		System.out.println(s4.length());
		System.out.println(s5.length());
		System.out.println(s4.isEmpty());
		System.out.println(s5.isEmpty());
		System.out.println(s6.isEmpty());

	}

}
