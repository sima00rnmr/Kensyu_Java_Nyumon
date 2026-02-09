package ch10;

public class SuperHero extends Hero {
	boolean flying;
	
	public void fly() {
		this.flying=true;
		System.out.println(this.name+"は飛び上がった！");//名前も継承しているか試してみる
		
	}
	public void land() {
		this.flying=false;
		System.out.println(this.name+"は着地した！");
		this.hp -=5;// コストを払う…なんてことできるかな？テスト
		
	}
	//逃げる
	/*オーバーライド（再定義している）
	 * 逃げ出した→撤退した
	 * に上書きしている
	 */
		public void run() {
			System.out.println(this.name + "は撤退した！");
		}


}
