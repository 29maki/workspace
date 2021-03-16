package lesson03;

public class Main {

	public static void main(String[] args) {

		Burger cheese = new Burger();
		cheese.setBurgerName("チーズバーガー");
		cheese.setCal(385);
		cheese.setCost(67);
		Burger lettuce = new Burger();
		lettuce.setBurgerName("レタスバーガー");
		lettuce.setCal(332);
		lettuce.setCost(89);

		System.out.print("カロリー合計は");
		System.out.print(cheese.getCal() + lettuce.getCal() );


	}

}
