
public class GradQAProblem3 {
public static void main(String args[])
{
	int n=192;
	int digits=0;
	boolean result;
	int temp=n;
	while(temp!=0) {
		temp=temp/10;
		digits++;
	}
	
	if(digits!=3) {
		System.out.println("Output: No");
		System.exit(0);
	}
	
	if(n%2==0)
	{ System.out.println("Multiple of 2:  Yes"); }
	else { System.out.println("Output: No"); System.exit(0); }
	if(n%3==0)
	{ System.out.println("Multiple of 3:  Yes"); }
	else { System.out.println("Output: No"); System.exit(0); }
	
	String  new_n=""+n+(n*2)+(n*3);
	//System.out.println("Concatinated n: "+new_n);
	
	result=checkOccurance(Integer.parseInt(new_n));
	System.out.println("Output: "+result);
}
	public static boolean checkOccurance(int no)
	{
		String n=no+"";
		for(int i=1;i<=9;i++)
			n=n.replace(""+i,"");
		
		//after replacing all digits it should be empty, if the occurence of all digits is one
		if(n.length()==0)
			return true;
		else
			return false;
	}
}
