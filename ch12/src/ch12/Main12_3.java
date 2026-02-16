package ch12;

public class Main12_3 {

	public static void main(String[] args) {
		Wizard w = new Wizard();
		Matango m = new Matango();
		w.name ="アサカ";
		Caracter c =w;
		
		/*Caracterからattackは継承しているので
		 * Wizardで上書きしているもののcで呼び出すことができる
		 */
		c.attack(m); 
		/*Caracter上にFireballは存在していないので
		 * cで呼び出すことが出来ない。
		 * w（Wizard）上で追加されたメソッドであるため、
		 * wであれば呼び出せる。エラーも起こらない
		 * 
		 * */
		
		w.Fireball(m);

	}

}
