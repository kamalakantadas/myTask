import java.util.Scanner;
class CustomException{
	static void validateInput(int number) throws inputInvalidException {
		if(number>100){
			throw new inputInvalidException("Exception");
		}
		System.out.println("Valid input");
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number < 100: ");
		int inputNum = sc.nextInt();
		try{
			validateInput(inputNum);
		}
		catch(inputInvalidException e){
			System.out.println("Input is greater than 100");
		}		
	}
	
}
class inputInvalidException extends Exception{
		inputInvalidException(String errorMessage){
			super(errorMessage);
		}
	
}