
public class GradQAProblem2 {
public static void main(String args[])
{
// remove common characters of 2 strings. and then join both of them

//	String s1= "aacdb";
//	String s2= "gafd";
	
	String s1= "abcs";  
	String s2= "cxzca";  
	

	
//	String tempStr;
//	
//	if(s1.length()<s2.length()) // check length and swap always first string should be big one
//	{
//		tempStr=s1;
//		s1=s2;
//		s2=tempStr;
//	}
	
	for(int i=0;i<s1.length();i++) {
	char temp=s1.charAt(i);	
	s2=s2.replaceAll(temp+"","");
	s1=s1.replaceAll(temp+"","");
	}
	
	System.out.println("String 1 "+s1);
	System.out.println("String 2 "+s2);
	
	System.out.println("Result String: "+s1+s2);
}
}
