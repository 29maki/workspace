package lesson05_03;

//練習５－２,５－３
public class Main {

	public static void main(String[] args) {
		String title = "〇〇の件";
		String address = "honyarara@gmail.com";
		String text = "こんにちは";
		System.out.println("練習５－２");
		email(title, address, text);

		System.out.println("練習５－３");
		email(address, text);


		//email("健康診断のお知らせ","minato@gmail.com","こんにちは"); だけでも動くよ
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}


}
