package ch10;

public class Main10_4 {

	public static void main(String[] args) {
		SuperHero sh =new SuperHero();
		sh.run();
		sh.fly();
		System.out.println(sh.name+"の現在のHPは"+sh.hp);
		sh.land();
		System.out.println(sh.name+"の現在のHPは"+sh.hp);
		
	}

}
