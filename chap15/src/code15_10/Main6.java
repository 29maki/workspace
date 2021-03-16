package code15_10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main6 {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		LocalDate ldate = LocalDate.parse("2020年09月22日", fmt);

		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str);

		LocalDate now = LocalDate.now();
		if (now.isAfter(ldatep)) {
			System.out.println("1000日後は過去日付です");
		}
	}

}
