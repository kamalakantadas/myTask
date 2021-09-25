
//interface B{}
interface StaticIface{
	//static method
	static int m1(){return 1;}
	public static void m2(){;}
	void add();
	//final static void m3(){;}
	//abstract static void m4(){;}
	//static void m5();
	
	/*void bounce();
	//default method bydefault public
	default int m1(){return 1;}
	public default void m2(){;}
	//static default void m3(){;}//illegal combination of modifier static and default
	//default void m4();missing method body
*/}

class A implements StaticIface{
	public void add(){
		System.out.println("Hello,Rahul");
	}
	public static void main(String[] args){
		new A().add();
		System.out.println(StaticIface.m1());//static method m1() need a interface Name while invoke
		new A().go();		
	}
	void go(){
		System.out.println(StaticIface.m1());//Also legal here
	}
	
}

