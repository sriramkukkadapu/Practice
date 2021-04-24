import java.util.Scanner;

public class cgi_program1 {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n;
		
		int fact=1;
		
		while(n!=0) {
			fact=fact*n;
			n=n-1;
		}
		
		System.out.println(fact);
		n=temp;
		
		int count=0;
		while(n%10==0) {
			if(n%10==0) {
				count++;
				n=n/10;	
			}
			else
				break;
			
		}
		
		System.out.println(count);
		
	}
}
