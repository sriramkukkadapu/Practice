

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TCS_Program1 {
public static void main(String args[])
{

	//String s= "Hello Welcome";
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s2="";
	// a,e,i,o,u
	int a=0,e=0,i=0,o=0,u=0;
	for(int index=0;index<s.length();index++)
	{
		if(s.charAt(index)=='a')
		a++;
		if(s.charAt(index)=='e')
		e++;
		if(s.charAt(index)=='i')
		i++;
		if(s.charAt(index)=='o')
		o++;
		if(s.charAt(index)=='u')
		u++;
		
		if(s.charAt(index)!='a' && s.charAt(index)!='e' && s.charAt(index)!='i'&& s.charAt(index)!='o' && s.charAt(index)!='u')
			s2=s2+s.charAt(index);
		
	}
	
	if(a==0&&e==0&&i==0&&o==0&&u==0) {
		System.out.println(0);
	}
	
	else {
	System.out.println("a:"+a);
	System.out.println("e:"+e);
	System.out.println("i:"+i);
	System.out.println("o:"+o);
	System.out.println("u:"+u);
	System.out.println(s2);
	}
	
}
}
