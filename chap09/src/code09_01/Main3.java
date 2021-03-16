package code09_01;

public class Main3 {

	public static void main(String[] args) {
		String s = new String("こんにちは");
		System.out.println(s);
		if (s == "こんにちは") { // ==を使うと、違うアドレス番地の文字列と比較してしまう
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (s.equals("こんにちは")) { //.equalsは同じアドレス番地の文字列と比較してくれる
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		//文字列の比較の場合は＝＝を使ってはいけない。
		//.eqalsメソッドは引数がString型、戻り値はboolean型
		//同じアドレス内の文字列を調べる
	}

}
