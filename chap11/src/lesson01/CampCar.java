package lesson01;

//キャンピングカーは普通車ではない
public class CampCar extends Car {
	public void run() {
		System.out.println("普通に走る");
	}

	public void stop() {
		System.out.println("普通に停まる");
	}

	public void camp() {
		System.out.println("ここをキャンプ地とする");
	}
}
