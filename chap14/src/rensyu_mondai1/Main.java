package rensyu_mondai1;

public class Main {

	public static void main(String[] args) {
		BankAccounts a = new BankAccounts();
		a.accountNumber = "4649";
		a.balance = 1592;
		System.out.println(a);

		BankAccounts b = new BankAccounts();
		b.accountNumber = "   4649  ";
		b.balance = 1592;

		if (a.equals(b)) {
			System.out.println("同じ口座です");
		} else {
			System.out.println("違う口座です");
		}

	}
}
