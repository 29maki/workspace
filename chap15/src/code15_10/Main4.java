package code15_10;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main4 {

	public static void main(String[] args) {
		Instant i1 = Instant.now(); //現在日時を取得
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();
		System.out.println(l);

		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		//東京時間2020年1月2日3時4分5秒6ナノ秒

		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

		System.out.println("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		if (z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています");
		}

	}
}
