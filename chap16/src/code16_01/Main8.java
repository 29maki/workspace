package code16_01;
import java.util.ArrayList;
import java.util.List;

class Hero {
	 public String name;
}

public class Main8 {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		List<Hero> list =  new ArrayList<Hero>();
		list.add(h);
		h.name ="スガワ";
		System.out.println(list.get(0).name);
	}

}
