class Frog{
	private static int frogCount= 0;
	static int getCount(){
		return frogCount;
	}
	public Frog(){
		frogCount += 1;
	}
		
}
/*Edited using git*/
class TestFrog{
	public static void main(String[] args){
		new Frog();
		new Frog();
		new Frog();
		System.out.println("Frog static "+Frog.getCount());//3
		new Frog();
		new TestFrog().go();
		Frog f = new Frog();
		
		System.out.println("use reference variable " + f.getCount());//5
	}
	void go(){
		System.out.println("from instance " +Frog.getCount());//4
	}
}