class TestEx1{
	public static void main(String[] args){
		doStuff();
	}
	static void doStuff(){
		doMoreStuff();
	}
	static void doMoreStuff(){
		try{
			int x = 4/0;
		}			
		catch(ArithmeticException e){
			System.out.println("number can't be divided by zero");
		}
		
	}
}