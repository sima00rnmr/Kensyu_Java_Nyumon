package ch8;

import java.util.*;

public class Main8_17_1_Cleric {
	String name;
	int hp = 50;
	final int MaxHp = 50;
	int mp = 10;
	final int MaxMp = 10;

	public void selfAid() {

		System.out.println("セルフエイドを唱えた！");
		this.hp = this.MaxHp;
		this.mp -= 5;
		System.out.println("HPが" + this.hp + "まで回復した！");

	}

	public void pray(int sec) {

		System.out.println("祈った！");
		int recover = new Random().nextInt(3) + sec;
		
		int recoverActual = Math.min(this.MaxMp - this.mp, recover );
		
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual +"回復した");
			
		}

	}
