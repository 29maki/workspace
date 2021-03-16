package rensyu_mondai1;

public class BankAccounts {
	String accountNumber;
	int balance;


	@Override
	public String toString() {
		return "\\" + this.balance + "(口座番号：" + this.accountNumber + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof BankAccounts) {
			BankAccounts a = (BankAccounts) obj;
			String an1 =a.accountNumber.trim();
			String an2 =this.accountNumber.trim();
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}

}
