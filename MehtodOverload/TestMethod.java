import java.lang.Exception;
class TestMethod{
	public void m1(int i) throws IndexOutOfBoundsException{
		System.out.println("Check method");
	}
	
}
class checkMethod{
	public native void m1() throws IndexOutOfBoundsException{}
	public static void main(String[] args){
		checkMethod cM = new checkMethod();
		cM.m1();
		//cM.m1(20);
		//TestMethod.m1(50);
		TestMethod tM = new TestMethod();
		tM.m1(40);
	}
}