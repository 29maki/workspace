package code16_01;

import java.util.ArrayList;

public class Main01 {

	public static void main(String[] args) {
		//ArrayList準備
		ArrayList<String> names = new ArrayList<String>();

		names.add("田中");
		names.add("鈴木");
		names.add("斎藤");

		for (String i : names) {
			System.out.println(i);
		}

	}
}