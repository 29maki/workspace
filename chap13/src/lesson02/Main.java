package lesson02;

//レジスターのシステムを開発します。
//各商品をインスタンスとし生成します。
//各商品は「商品名」と「値段」を持っています。
//「商品名」は登録時に入力したあと、変更できなくしてください。
//商品を任意に三つ以上登録してください。
//レジスターシステムは、任意の商品が購入された場合以下のように表示します
//表示例　■■購入商品■■
//りんご　　　　　238円、
//お買い上げ金額



public class Main {

	public static void main(String[] args) {
		Goods g1 = new Goods("りんご");
		g1.setPrice(128);
		Goods g2 = new Goods("アボカド");
		g2.setPrice(198);
		Goods g3 = new Goods("キウイ");
		g3.setPrice(91);
		Regi r = new Regi();
		r.okaiage(g1, g2, g3);
	}

}
