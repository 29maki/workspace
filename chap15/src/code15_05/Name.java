package code15_05;

import java.util.Scanner;

public class Name {
	String name = new Scanner(System.in).nextLine();

	public boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}

}
