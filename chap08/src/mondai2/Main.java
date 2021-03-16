package mondai2;

public class Main {

	public static void main(String[] args) {
		Car keitora = new Car();
		keitora.fuel = 1000;
		//keitora.speed = 60;  ←カプセル化のために本当は書かないほうがいい

		keitora.accelarate(50);
		int dist = keitora.run(2); //runに戻り値があるため変数が返ってくる書き方をする
		System.out.println(dist + "km走りました");
		keitora.stop();
		keitora.showMeter();
	}

}
