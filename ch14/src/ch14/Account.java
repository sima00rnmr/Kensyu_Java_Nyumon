package ch14;

public class Account {
	private String accountNunmber;
	private int balance;
	/*文字列表現メソッド*/
	public String toString() {
		return "\\"+this.balance +"(口座番号:"+this.accountNunmber+")";
		
	}
	/*等価判定メソッド*/
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Acount a) {
			String an1 = this.accountNunmber.trim();
			String an2 = a.accountNunmber.trim();
			if(an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
	
}
