package lesson01;

public class PetHotel {
	public void service(Animals[] ani) {
		for (Animals a : ani) {
			a.keep();
		}
	}
}
