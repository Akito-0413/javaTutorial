//静的メンバ

public class SampleClassEx01{
	private int value = 0;//インスタンスフィールド
	private static int num = 0;//静的フィールド
	
	public SampleClassEx01(int value) {//コンストラクタ（引数あり）
		this.value = value;//引数をインスタンスフィールドに代入
		num++;
	}
	
	public SampleClassEx01() {//コンストラクタ（引数なし）
		this(100);//引数つきコンストラクタを呼び出す
	}
	
	public static int getNumberOfInstance() {//インスタンスの数を取得
		return num;
	}
	
	public int getValue() {
		return this.value;
	}
}

//静的メンバには、必ずstaticの修飾子をつける