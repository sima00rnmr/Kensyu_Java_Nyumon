package ch8;

class Main8_16 {//Matango
	int hp;
	final int LEVEL =10;
	char suffix;
	public void rnm() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
	
	public static void main(String[] args) {
		Main8_2 h =new Main8_2();
		h.name ="ミナト";
		h.hp = 100;
		
		Main8_5 m1 =new Main8_5 ();
		m1.hp =50;
		m1.suffix ='A';
		
		Main8_5  m2= new Main8_5 ();
		m2.hp = 48;
		m2.suffix ='B';
		
		
		h.slip();
		m1.run();
		m2.run();
		h.run();
		
		
		/*
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix ='A';*/
				

	}

}
