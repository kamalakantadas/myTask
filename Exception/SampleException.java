class kamalakantaException extends Exception{
	int x;
	kamalakantaException(int y){
		x=y;
	}
	public String toString(){
		return("Exception number "+x);
	}
}

class SampleException{
	public static void main(String[] args){
		try{
			throw new kamalakantaException(5);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	/*
	static void avg()throws ArithmeticException{
		System.out.println("inside function Avg");
		throw new ArithmeticException("Demo");		
	}
	public static void main(String[] args){
		try{
			avg();
		}
		finally{
			System.out.println("caught throws exception here at the last");
			System.out.println("caught throws exception here at the last");
		}
		
		//string name= null;
		//system.out.println(name.length());
		/*try{
			int x =20;
			int y = x/0;
			system.out.println(y);
			
		}
		catch(arithmeticexception e){
			system.out.println("cant divide a number by zero");
		}*/
		/*try{
			int[] myar = new int[5];
		System.out.println(myar[5]);
		}
		catch(arrayindexoutofboundsexception e){
			system.out.println("arrayindexoutofboundsexception");
		}
		
		try{
			int x = Integer.parseInt("rahul");
			
			System.out.println(x);			
		}/*
		catch(numberformatexception e){
			system.out.println("string cant be assigned to integer"); 	
		}
		finally{
			System.out.println("Finallly get exectued always");
		}*/
	}
