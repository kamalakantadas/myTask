import java.util.Scanner;
class Propogate{
	 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String rName = sc.next();
		System.out.println(reverse(rName));
	}
	static String reverse(String name){
		String reverseName="";
		try{
			if(name.length()==0){
				
			}
			else{
				for(int i =name.length()-1;i>=0;i--){
					reverseName += name.charAt(i);
				}
			}	
		}		
		catch(Exception e){
			System.out.println("Exception caught");
		}
		finally{
			System.out.println("No problem");
		}
		return reverseName;
	}
}