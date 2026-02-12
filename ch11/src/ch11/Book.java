package ch11;

public abstract class Book extends TangibleAsset{
	String isbn;

	//コンストラクタ
	public Book(String name,int price,String color,String isbn) {
		super(name,price,color);
		this.isbn = isbn;
	}
	
	//メソッド

	public String getisbn() {
		return this.isbn;
	}
}
