class Foo{
	void doStuff(){
	System.out.println("Foo method call");
	}
}
class Bar extends Foo{
	void doStuff(){
		System.out.println("override Foo method call");
	}
	void doStuff(String s){
		System.out.println("Bar method"+s);
	}
	public static void main(String[] args){
		Foo fooRef = new Foo();
		fooRef.doStuff();//Foo method call
		Foo fooRefToBar = new Bar();
		fooRefToBar.doStuff();//override Foo method call
		Bar barRef = new Bar();
		barRef.doStuff();//override Foo method call
		barRef.doStuff("apple");//Bar method apple
		
		fooRef.doStuff();// foo method call- 1st assumtion 2nd - compile time error
		fooRefToBar.doStuff();//Foo method call-1st assumtion
	}
}