interface I1{
	default int doStuff(){
		System.out.println("i1 interface"); 
		
		return 1;
	}
	
}
interface I2{
	default int doStuff(){
		System.out.println("i2 interface"); 
		return 2;}
}
public class TestIFace implements I1,I2{
	public static void main(String[] args){
		new TestIFace().go();
	}
	void go(){
		System.out.println(doStuff());
	}
	
	public int doStuff(){
		System.out.println("inside Main interface"); 
		return 3;
	}
}