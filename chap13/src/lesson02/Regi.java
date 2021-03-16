package lesson02;

public class Regi {
	public void okaiage(Goods g1, Goods g2, Goods g3) {
		System.out.println("■■購入商品■■");
		System.out.println(g1.getName() + "\t" + g1.getPrice() + "円");
		System.out.println(g2.getName() + "\t" + g2.getPrice() + "円");
		System.out.println(g3.getName() + "\t" + g3.getPrice() + "円");
		int goukei = g1.getPrice() + g2.getPrice() + g3.getPrice();
		System.out.println("お買い上げ合計" + goukei);

	}

}
