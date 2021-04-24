import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CenturyLink_BobAlice_LikesDisliks {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter Bobs data: ");
		String bob=sc.next();
		System.out.println("Enter Alice data: ");
		String alice=sc.next();
		
		if(bob.length()!=alice.length())
			System.out.println("Input is invalid");
		
		int count=0;
		for(int i=0;i<bob.length();i++)
		{
			if(bob.charAt(i) == alice.charAt(i))
				count++;
		}
		
		System.out.println("Count of common opinions: "+count);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
