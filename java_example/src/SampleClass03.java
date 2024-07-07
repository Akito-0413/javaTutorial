public class SampleClass03{
	//カプセル化 / 通常フィールドはprivateで隠蔽し、外部からアクセスするメソッドを介して値の変更・取得を行う
	private int number = 0;//int型のフィールド
	private String str = "";//String型のフィールド
	
	public SampleClass03(String str) {
		this.str = str;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getStr() {
		return this.str;
	}
}