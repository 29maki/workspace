package code16_01;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("みなと");
		names.add("あさか");
		names.add("すがわら");
		Iterator<String> it = names.iterator(); //イテレータの取得
		while (it.hasNext()) { //次の要素があれば行う
			String e = it.next(); //次の要素を指して返す
			System.out.println(e);
		}
	}

}
