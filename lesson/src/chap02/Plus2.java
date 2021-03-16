package chap02;

public class Plus2 {

	public static void main(String[] args) {
		System.out.println("名字を入力してください");
		String myouzi = new java.util.Scanner(System.in).nextLine();
		System.out.println("名前を入力してください");
		String namae = new java.util.Scanner(System.in).nextLine();
		String name = myouzi+namae;
		System.out.println(name);
	}

}
