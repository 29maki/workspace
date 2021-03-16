package chap05;

public class Main2 {

	public static void main(String[] args) {
		String title ="お問い合わせ";
		String address ="@gmail.com";
		String text ="お世話になっておりま";
		email(title, address, text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文："+ text);

	}

}
