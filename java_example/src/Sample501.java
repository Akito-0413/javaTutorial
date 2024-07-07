public class Sample501{
	
	public static void main(String[] args) {
		double one,two,three;
		double sum, avg;
		one = 1.2;
		two = 3.7;
		three = 4.1;
		System.out.println(one + "" + two + "" + three);
		sum = one + two + three;
		avg = sum/3.0;
		System.out.println("合計値；" + sum);
		System.out.println("平均値；" + avg);
		
		//配列変数
		double[] d = new double[3];
		double sum2, avg2;
		d[0] = 1.2;
		d[1] = 3.7;
		d[2] = 4.1;
		sum2 = 0.0;
		for(int i = 0; i<d.length; i++) {
			System.out.print(d[i] + "");
			sum2 += d[i];
		}
		System.out.println();
		avg2 = sum2 / 3.0;
		System.out.println("合計値；" + sum2);
		System.out.println("平均値；" + avg2);
		
		//(配列変数名).length　配列変数の成分の長さ
		//(変数の型名) (変数名)[] = new (変数の型名)[配列の数];
		//(変数の型名) [](変数名) = new (変数の型名)[配列の数];
		
		//	配列の初期化
		int n[] = {5,4,3,2,1};
		String s[] = {"ABC","DEF","GHI"};
		int i;
		for(i=0;i<n.length; i++) {
			System.out.println(n[i]+"");
		}
		System.out.println();
		
		for(i=0;i<s.length;i++) {
			System.out.print(s[i]+"");
		}
		System.out.println();
		
		//多次元配列
		int a[][] = new int[3][4];
		int x,y;
		for(x=0;x<a.length;x++) {
			for(y=0;y<a[x].length;y++) {
				a[x][y] = x+y;
			}
		}
		
		for(x = 0; x < a.length; x++){
	       for(y= 0; y < a[x].length; y++){
	         System.out.print(a[x][y]+" ");
	       }
	       System.out.println();
	     }
	}

}