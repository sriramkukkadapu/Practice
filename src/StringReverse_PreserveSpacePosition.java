
public class StringReverse_PreserveSpacePosition {
public static void main(String args[])
{
	String s="Sriram Kukkadapu Is a Quality Analyst";
	int i,j;
	String rev="";
	
	for(i=s.length()-1,j=0;i>=0;i--,j++)
	{
		
		if(s.charAt(j)==' ')
			rev=rev+' ';
		
		if(s.charAt(i)!=' ')
			rev=rev+s.charAt(i);
			
	}
	
	System.out.println(rev);
}
}
