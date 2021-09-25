import java.util.Scanner;
class Logic1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			long n = sc.nextLong();
			long s= sc.nextLong();
			long pos = (n*(n+1)/2)-s;
			if(pos>=1 && pos<=n)
				System.out.println(pos);
			else
				System.out.println(-1);
			t--;
		}
	}
}