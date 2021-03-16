package code15_10;

public class Main0 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//時間がかかる処理↓
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		long end = System.currentTimeMillis();
		long end1 = end - start;
		System.out.println("処理にかかった時間は…" + (end1) + "ミリ秒でした");

		start = System.currentTimeMillis();

		s = "Java";
		for (int i = 0; i < 100000; i++) {
			s = s + "Java";
		}

		end = System.currentTimeMillis();
		long end2 = end - start;
		System.out.println("＋演算子で処理にかかった時間は…" + (end2) + "ミリ秒でした");
		System.out.println("＋演算子で処理にかかった時間はStringBuilderで"
				+ "処理にかかった時間の…\n" + (end2 / end1) + "倍でした");
	}

}
