import java.util.Scanner;

public class cgi_program2 {
public static void main(String args[])
{
			//haveagoodday
			//a
	
			//3
			
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();  //input Word
			String c_str=sc.nextLine(); //read next line for one char
			char c = c_str.charAt(0);   //take only 1st char in above string
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i) == c)
					count++;
			}
			
			System.out.print(count);
	
}
}
