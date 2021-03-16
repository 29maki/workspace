package code17_01;

import java.io.FileWriter;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("エラー");
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				;
			}
		}

	}

}
