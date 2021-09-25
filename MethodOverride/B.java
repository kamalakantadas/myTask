class A{
	static void addition(){
		System.out.println("a class addition");
		
	}
}
class B extends A{
	static void addition(){
		System.out.println("b class Addition");
	}
	public static void main(String[] args){
	A.addition();
	A a = new A();
	a.addition();
	A b = new B();
	b.addition();
	
	//B b = new B();
	//A a = new B();
	//b.addition();
	//a.addition();
		
	}
}
