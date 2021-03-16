package code15_01;

public class Main9 {

	public static void main(String[] args) {
		Charactor c1 = new Charactor();
		c1.name = "MINATO";
		c1.job = "hero";
		c1.money = 4000;
		Charactor c2 = new Charactor();
		c2.name = "asaka";
		c2.job = "witch";
		c2.money = 32000;
		Charactor c3 = new Charactor();
		c3.name = "sugawara";
		c3.job = "sage";
		c3.money = 41000;

		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format(FORMAT, c1.name,c1.job,c1.money);
		System.out.println(s);
		String t = String.format(FORMAT, c2.name,c2.job,c2.money);
		System.out.println(t);
		String u = String.format(FORMAT, c3.name,c3.job,c3.money);
		System.out.println(u);
	}

}
