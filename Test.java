import java.util.Scanner;
class abc{
	static void printName(){
		System.out.println("hello, Rahul");
	}
}
class Test{
	public static void printName(){
		System.out.println("Rakesh");
	}
	public static void main(String[] args){
		printName();
	//int x = 10;
	//static int  y=20;
	/*
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch(x){
			case 'a': System.out.println("98");break;
			case 'b': System.out.println("99");break;
			case 'c': System.out.println("100");break;
			default: System.out.println(x);
		}
		/*
		String s1 = "Bob";
		String s2 = "Bob";
		String s3 = "bob";
		String s4= s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1==s4);
		char c = 'a';
		int x = 10;
		System.out.println(c+x);
		/*Test t1 = new Test();
		t1.x = 888;
		t1.y = 999;
		Test t2 = new Test();
		System.out.println(t2.x + "   ..... "+ t2.y);
*/	}
}