package chap03;

public class Main {

	public static void main(String[] args) {
		//		weight == 60
		//		(age1 + age2)*2 >60
		//		age%2 == 1
		//		name.equals("湊")
		//
		//		int isHungry = 0;
		//		String food = "チョコ";
		//		System.out.println("こんにちは");
		//		if (isHungry == 0) {
		//			System.out.println("おなかがいっぱいです");
		//		} else {
		//			System.out.println("はらぺこです");
		//		}
		//		if (isHungry == 1) {
		//			System.out.println(food + "をいただきます");
		//		}
		//
		//		System.out.println("ごちそうさまでした");
		//
		//		boolean tenki = false;
		//		if (tenki == true) {
		//			System.out.println("洗濯をします");
		//			System.out.println("散歩にいきます");
		//		} else {
		//		System.out.println("DVDをみます");
		//		System.out.println("寝ます");
		//		}

		System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更>");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		}


		//		System.out.println("【数あてゲーム】");
		//		int ans = new java.util.Random().nextInt(10);
		//		for (int i = 0; i < 5; i++) {
		//			System.out.println("０～９の数字を入力してください");
		//			int num = new java.util.Scanner(System.in).nextInt();
		//			if (num == ans) {
		//				System.out.println("アタリ！");
		//				break;
		//			} else {
		//				System.out.println("違います");
		//			}
		//		}
		//		System.out.println("ゲームを終了します");

	}

}
