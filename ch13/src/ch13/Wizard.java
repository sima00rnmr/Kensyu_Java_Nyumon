package ch13;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {

		if (name.length() <= 3 || name == null) {
			throw new IllegalArgumentException("魔法使いの名前の異常");
		}
		this.name = name;
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {
		this.wand = wand;
		if(wand == null) {
			throw new IllegalArgumentException("杖がnull　装備する");
			
		}
	}

	public void setHp() {
		if (hp < 0) {
			hp = 0;
		}
	}

	public void setMp() {
		if (mp < 0) {
			mp = 0;
		}
	}
}
