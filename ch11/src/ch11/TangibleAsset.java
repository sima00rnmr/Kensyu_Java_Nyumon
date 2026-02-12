package ch11;

public abstract class TangibleAsset extends Asset
		implements Thing {
	String color;
	double weight;

	public TangibleAsset(String name, int price, String color, double weight) {
		super(name, price);
		this.weight = weight;
		this.color = color;
	}

	public abstract String getcolor();

	public abstract String getweight();

	public abstract String setweight(double getweight);

	{
		this.weight = weight;
	}

}
