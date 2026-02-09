package ch10;
/*10_11 親のインスタンス部分が作れない状況
 * 
 * */
public class Item {

	String name;
	int price;
	public Item(String name) {
		this.name =name;
		this.price=0;
		
	}
	public Item(String name,int price) {
		this.name =name;
		this.price=price;
		
		
	}
	
}
