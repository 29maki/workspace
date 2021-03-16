package code15_01;

public class Main2 {

	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		if (s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		if (s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));

		System.out.println(s1.contains("Java"));
		System.out.println(s1.startsWith("Java"));
		System.out.println(s1.startsWith("J"));
		System.out.println(s1.indexOf("J"));
		System.out.println(s1.indexOf('j')); //char型は整数型なので使える
		System.out.println(s1.indexOf(74)); //char型一覧によると74はJを意味する

	}

}
