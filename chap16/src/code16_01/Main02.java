package code16_01;

import java.util.ArrayList;

public class Main02 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("新宿");
		names.add("笹塚");
		names.add("明大前");
		names.add("千歳烏山");
		names.add("調布");
		names.add("府中");

//		for(int i =0; i < names.size(); i++) {
//			System.out.println(names.get(i));
//		}

		for (String s : names) {
			System.out.println(s);
		}
	}
}