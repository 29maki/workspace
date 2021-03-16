package rensyu_mondai;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		List<Hero> name = new ArrayList<Hero>();
		name.add(h1);
		name.add(h2);
		for (Hero h : name) {
			System.out.println(h.getName());

		}
	}
}
