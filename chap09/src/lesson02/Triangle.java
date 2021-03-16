package lesson02;

public class Triangle {
	double teihen;
	double takasa;
	public Triangle(double takasa, double teihen) {
		this.takasa = takasa;
		this.teihen = teihen;
	}

	public double menseki() {
		double menseki = this.teihen * this.takasa / 2;
		return menseki;
	}

}
