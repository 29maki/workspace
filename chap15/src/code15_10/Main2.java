package code15_10;

import java.util.Calendar;
import java.util.Date;

public class Main2 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2019, 8, 22, 1, 23, 45);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime(); //カレンダーをdate型に
		System.out.println(d);
		Date now = new Date();
		c.setTime(now); //dateをカレンダーに
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "です");
	}

}
