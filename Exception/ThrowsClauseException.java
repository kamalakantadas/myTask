class ThrowsClauseException{
	static void avg()throws ArithmeticException{
		throw new ArithmeticException();
		//int x=5/0;
		//System.out.println("inside function Avg");
		
		//throw new ArithmeticException("Demo");		
	}
	public static void main(String[] args){
		try{
			avg();
		}
		/*catch(ArithmeticException e){
			System.out.println("exception caught");
		}*/
		finally{
			System.out.println("caught throws exception here at the last");
			System.out.println("caught throws exception here at the last");
		
		}
	}
}
