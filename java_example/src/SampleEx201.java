//継承 / 基本となるクラスの性質を受け継ぎ、独自の拡張をすること
//継承のもととなるクラス→親クラス、スーパークラス
//親クラスの機能を継承し、独自の機能を実装したクラス→子クラス、サブクラス

public class SampleEx201{
	
	public static void main(String[] args) {
		Car C = new Car();
		c.supply(10);
		c.move();
		c.move();
		Ambulance a = new Ambulance();
		a.supply(10);
		a.move();
		a.sevePeople();
	}
}