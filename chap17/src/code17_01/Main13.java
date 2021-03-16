package code17_01;

public class Main13 {

	public static void main(String[] args) {
		try {
			throw new UnsupportedMusicFileException("未対応のファイルです");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
