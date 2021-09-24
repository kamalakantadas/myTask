class ExceptionNullPointer{
	public static void main(String[] args){
		String[] arElement = new String[5];
		System.out.println(arElement[0]);
		try{
			System.out.println(arElement[0].length());
		}catch(NullPointerException e){
			System.out.println("NullPointer Exception caught"+e);
		}
		catch(Exception e){
			System.out.println("Exception at last before Finally clause");
		}
		
	}
}