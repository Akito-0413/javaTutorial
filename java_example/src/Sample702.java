public class Sample702{
	
	public static void main(String[] args) {
		//引数つきコンストラクタの呼び出し
		SampleClass03 s = new SampleClass03("HelloWorld.");
		
		s.setNumber(100);
		
		System.out.println(s.getNumber());
		System.out.println(s.getStr());
	}
}