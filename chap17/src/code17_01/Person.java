package code17_01;

public class Person {
	int age;

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException
			("年齢以上は０以上の数を指定すべきです。指定値1＝" + age);
		}
		this.age = age;
	}
}
