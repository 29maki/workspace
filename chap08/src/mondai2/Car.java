package mondai2;

public class Car {

	int fuel;
	int speed;

	public void accelarate(int km) {
		this.speed += km;
	}

	public int run(int hour) {
		int kyori = this.speed * hour; //距離＝速さ×時間
		this.fuel -= kyori; //距離分燃料が減る
		//System.out.println(kyori + "キロ進みました"); ←返り値があるため今回は書かないほうがいい
		//showMeter();
		return kyori;
	}

	public void stop() {
		this.speed = 0;
		System.out.println("停止しました");

	}

	public void showMeter() {
		System.out.println("現在の燃料は" + this.fuel + "です。時速は" + this.speed + "です");
	}
}
