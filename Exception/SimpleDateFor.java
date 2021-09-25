import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFor{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter date in  dd/mm/yyyy format: ");
		String date = sc.nextLine();
		convertDateFormat(date);
	}
	static void convertDateFormat(String txt){
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date date = sdf.parse(txt);
		SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy/mm/dd");
		String outputDate = outputsdf.format(date);
		System.out.println("after changing date format to yyy/MM/dd : "+outputDate);
		
		}
		catch(java.text.ParseException e){
			System.out.println("Some error occurence");
		}
	}
}