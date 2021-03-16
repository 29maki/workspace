package mondai;

public class Main {

	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "アカネ";
		c.hp = 50;
		c.mp = 7;
		System.out.println("聖職者" + c.name + "を呼び出しました！");

		c.pray(3);

	}

}
