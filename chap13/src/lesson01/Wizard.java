package lesson01;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
		this.hp = hp;
		}
		System.out.println("HPは"+ this.hp +"です" );

	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("0以下にはなりません");
		}
		this.mp = mp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException("3文字以上で指定してください");
		}
		this.name = name;
		System.out.println("名前は"+ this.name);
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("武器が装備されていません");
		}
		this.wand = wand;
	}
}
