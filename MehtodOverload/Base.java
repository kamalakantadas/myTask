class Base{
	static int x =10;
	static{
		m1();
		System.out.println("Base SB");
	}
	public static void main(String[] args){
		m1();
		System.out.println("Base Main");
		
	}
	public static void m1(){
		System.out.println(y);
	}
	static int y = 20;
}
class Derived extends Base{
	static int i = 100;
	static{
		m2();
		System.out.println("DFSB");
	}
	public static void main(String[] args){
		m2();
		System.out.println("Derived main");
	}
	public static void m2(){
		System.out.println(j);
	}
	static {
		System.out.println("DSSB");
	}
	static int j= 200;
	
}