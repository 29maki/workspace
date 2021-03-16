package rensyu_mondai;

public class Main {

	public static void main(String[] args) {
		System.out.println();
	}

	public String concatPath(String folder, String file) {
		if (!folder.endsWith("\\")) {
			folder += "\\";
		}
		return folder + file;
	}

}
