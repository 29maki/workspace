package kaiin;

public class Student extends Normal implements Member{
	int studentId;

	@Override
	public String kind() {
		return super.kind();
	}

	@Override
	public int payment() {
		Normal n = new Normal();
		double waribiki = n.getMonthlyPrice()*0.2;
		n.getMonthlyPrice() -= (int)waribiki;
		return super.payment();
	}

}
