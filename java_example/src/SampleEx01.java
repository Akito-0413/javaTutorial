public class SampleEx01{
	
	public static void main(String[] args) {
		SampleClassEx01 s1, s2;
		System.out.println("インスタンス数；"+SampleClassEx01.getNumberOfInstance());//インスタンスの数を表示
		
		//インスタンスを生成する
		s1 = new SampleClassEx01(50);//コンストラクタ①呼び出し
		s2 = new SampleClassEx01();//コンストラクタ②呼び出し
		
		//値を取得して表示する
		System.out.println(s1.getValue());
		System.out.println(s2.getValue());
		
		System.out.println("インスタンス数；"+SampleClassEx01.getNumberOfInstance());
	}
}