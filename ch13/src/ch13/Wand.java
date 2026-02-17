package ch13;

public class Wand {
	private String name;
	private double power;

	public String getName() {
		return this.name;

		if (name == null||name.length() <= 3) {
			throw new IllegalArgumentException("杖の名前が異常");
		}

	}

	}

	public double getPower() {
		return this.power;
	}

	public void setPower(double power) {
		this.power = power;
		if (this.power <= 0.5 || this.power > 100.0)
			;
		throw new IllegalArgumentException("杖の魔力が異常");

	}

	public void setName(String name) {
		if (name.length() <= 3 || this.name == null)
			;
		this.name = name;
		throw new IllegalArgumentException("杖の名前の異常");
	}

}
