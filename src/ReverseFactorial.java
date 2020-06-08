
public class ReverseFactorial {
public static void main(String args[])
{
	int n=24;
	int div=2;
	
	
	while(true)
	{
		int rem=n/div;
		if(rem!=1) {
			div++;
			n=rem;
		}
		else
			break;
		
			
	}
	
	System.out.println("N is: "+div);
}
}
