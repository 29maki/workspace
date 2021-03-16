package code17_01;

import java.io.FileWriter;
import java.io.IOException;

public class Main8 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("例外が発生しました");
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				; //失敗時には特に何もしない
			}
		}
	}

}
