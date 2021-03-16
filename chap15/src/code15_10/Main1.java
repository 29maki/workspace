package code15_10;

import java.util.Date;

public class Main1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now); //デートの中身
		System.out.println(now.getTime());
		Date past = new Date(1600705425827L);
		System.out.println(past);
		past.setTime(1601005425827L);
		System.out.println(past);
	}
}
