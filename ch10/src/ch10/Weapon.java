package ch10;
/*アイテムクラスの子クラス
 * 何も記載がないままだとsuper()で
 * 引数なしで呼び出してしまい、
 *Itemクラス内では引数が
 *0のコンストラクタは存在しないため
 *エラーが起きてしまっている。
 *…ここでは、引数が1か2のコンストラクタを宣言しないとダメ
 * */


public class Weapon extends Item {
	public Weapon() {
		super("名無しの剣",);
	}

}
