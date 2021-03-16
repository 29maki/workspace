package rensyu_mondai;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main5 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime future = now.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy MM dd");
		String s = future.format(fmt);
		System.out.println(s);

	}

}
