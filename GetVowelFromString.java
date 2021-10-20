import java.util.Scanner;
class GetVowelFromString{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String text = sc.nextLine();
	String toHold = vowelOnly(text);
	System.out.println(toHold);
	/*//DateCl dc = new DateCl();
	/Date d = new Date();
long tim= d.getTime();
System.out.println(tim);*/
}
public static String vowelOnly(String input){
	char[] element= input.toCharArray();
	String returnText="";
	for(int i=0;i<input.length();i++){
		if(element[i]=='a' || element[i]=='i' ||element[i]=='o' ||element[i]=='e' || element[i]=='u'){
			returnText +=element[i];
			}
		}
		return returnText;

	}
}