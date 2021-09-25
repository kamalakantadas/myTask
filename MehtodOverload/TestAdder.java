class Adder{
	public int addThem(int x,int y){return x+y;}
	public double addThem(double x, double y){return x+y;}
}

public class TestAdder{
	public static void main(String[] args){
		Adder a = new Adder();
		//int b = 27;
		//int c = 3;
		int result = a.addThem(10,30);
		double dResult= a.addThem(22.5,9.3);
		System.out.println(result+"  "+dResult);
	}
}