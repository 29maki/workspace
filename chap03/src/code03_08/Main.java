package code03_08;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i < 3; i++) {
			System.out.print("現在" + (i + 1) + "周目→");
		}
		for (int i = 1; i<10; i += 2) {
			System.out.print(i+"回");
		}
		for (int i =10; i>0; i--) {
			System.out.println(i+"日");
		}
		int i = 0;
		for (; i < 5; i++) {
			System.out.println(i);
		}
		for (i = 0; i<10;) {
			i++;
			System.out.println(i);
		}
	}

}
