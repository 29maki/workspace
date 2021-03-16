package code15_01;

public class Main7 {

	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		for (String w : words) {
			System.out.println(w + "->");
		}

		String t = "今日は３月３日ひな祭り";
		String[] array = t.split("日");
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
	}

}
