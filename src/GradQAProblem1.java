
public class GradQAProblem1 {
public static void main(String args[])
{
//	Problem: Given two strings S1, S2. Remove all the occurences of S2 characters from S1.
//	Example1:
//	Input: S1=helloworld S2=eo
//	Output: hllwrld
//	Example 2:
//	Input: S1=thoughtworks S2=otkd
//	Output: hughwrs
//
	
	String s1="helloworld";
	String s2="eo";
	
	for(int i=0;i<s2.length();i++) {
	char temp=s2.charAt(i);	
	s1=s1.replaceAll(temp+"","");
	}
	
	System.out.println("Result: "+s1);
}
}
