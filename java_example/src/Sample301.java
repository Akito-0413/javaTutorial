public class Sample301{
	//if文の書き方
	public static void main(String[] args) {
		int a = -5;
		System.out.println("a="+a);
		
		if(a>0) {
			System.out.println("aは正の数です");	
		}else {
			System.out.println("aは正の数ではありません");
		}
		
		//乱数生成プログラム
		int dice = (int)(Math.random()*7)+1;
		 System.out.println("サイコロの目"+ dice);
		 if(1 <= dice && dice <= 6) {//サイコロの目
			 if(dice == 2 || dice == 4 || dice == 6) {
				 System.out.println("丁です。");
			 }else {
				 System.out.println("半です。");
			 }
		 }else {
			 System.out.println("範囲外の数値です。");
		 }
		 //乱数の発生処理（例；0からn-1までの乱数を発生させる方法）
		 //(int)(Math.random()*n);
		 //例；1からnまでの乱数を発生させる方法
		 //(int)(Math.random()*n)+1;
		 
		 //switch文
		 int num = 1;
		 switch(num) {
		 case 1:
			 System.out.println("one");
			 break;
		 case 2:
			 System.out.println("two");
			 break;
		 default:
			 System.out.println("不適切な値です。");
		 }
	}
}

