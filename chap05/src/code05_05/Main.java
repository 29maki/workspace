package code05_05;

public class Main {
	public static void main(String[] args) {
		add(100, 20);
		add(200, 50);
	}

	//複数の値を受け取るaddメソッド
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);

	}
	//	 public static void main(String[] args){
	//		 int x =100;
	//		 int y = 10;
	//		 add(x,y);
	//	 }
	//
	//	 public static void add(int hoge, int poo) {
	//		 int ans = hoge + poo;
	//		 System.out.println(hoge + "+" + poo +"=" +ans);
	//	 }

}
