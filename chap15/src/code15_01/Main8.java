package code15_01;

public class Main8 {

	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);

		String t = "123.456";
		System.out.println(t.replace(".", ","));
		System.out.println(t.replaceAll(".", ","));
		System.out.println(t.replaceAll("[.]", ","));

	}

}
