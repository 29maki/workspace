package code10_02;

public class Main {

	public static void main(String[] args) {
		C c = new C();
		c.setName("あいうえお");
		System.out.println(c.getName());
	}

	//間接的になら親クラスの親クラスにいける
	//直接親の親にアクセスする手段はない
}
