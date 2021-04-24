import java.util.Scanner;

public class cgi_program3 {
public static void main(String args[])
{
	//2514795
	
	//27 (sum of odd numbers)
	
	Scanner sc=new Scanner(System.in);
	long  n= Long.parseLong(sc.nextLine());  //read input long Number
	
	long rem=0;  long sum=0;
	
	while(n!=0){
		rem = n%10;
		if(rem%2==1)
			sum=sum+rem;
		
		n=n/10;
	}
	
	System.out.print(sum);
	
}
}
