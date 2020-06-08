import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PasswordStrength {

	public static void main(String args[])
	{
		//Password length <=5
		
		//should have special char, number, alphabets then it is good.
		//any 2 combinations good
		// any one combination then weak
		
		boolean specialchar,alphabet,number;
		String s= "12345";
		
		if(s.length()<5)
			System.out.println("Weak");
		
		else {
		specialchar=checkforSpecialChar(s);
		alphabet=checkforAlphabet(s);
		number=checkforNumber(s);
		
		int noOfTrues=0;
		if(specialchar==true) noOfTrues++;
		if(alphabet==true) noOfTrues++;
		if(number==true) noOfTrues++;
		
		if(noOfTrues==2)
			System.out.println("Strong");
		
		else if(noOfTrues==1)
			System.out.println("Average");
		
		else if(noOfTrues==3)
			System.out.println("Very Strong");
		
		}
	}
	
	public static boolean checkforSpecialChar(String s)
	{
		
		Character specialChars[]= {'!','@','#','$','%','^','&','*','(',')','-','_','+','=','[',']','{','}','\\','|',';','\'','"',',','<','.','>','/','?','`','~'};
		Set<Character> charsSet=new HashSet<>(Arrays.asList(specialChars)); 
		
		for(int i=0;i<s.length();i++)
		{
			if(charsSet.contains(s.charAt(i)))
				return true;
		}
		
		return false;
		//Integer arr[] = { 5, 6, 7, 8, 1, 2, 3, 4, 3 }; 
        // Set demonstration using HashSet Constructor 
        //Set<Integer> set = new HashSet<>(Arrays.asList(arr)); 
	}
	
	public static boolean checkforAlphabet(String s)
	{
		
		
		 
		
		for(int i=0;i<s.length();i++)
		{
				if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
				return true;
		}
		
		return false;
		//Integer arr[] = { 5, 6, 7, 8, 1, 2, 3, 4, 3 }; 
        // Set demonstration using HashSet Constructor 
        //Set<Integer> set = new HashSet<>(Arrays.asList(arr)); 
	}
	
	public static boolean checkforNumber(String s)
	{
		
		Character specialChars[]= {'0','1','2','3','4','5','6','7','8','9'};
		Set<Character> charsSet=new HashSet<>(Arrays.asList(specialChars)); 
		
		for(int i=0;i<s.length();i++)
		{
			if(charsSet.contains(s.charAt(i)))
				return true;
		}
		
		return false;
		//Integer arr[] = { 5, 6, 7, 8, 1, 2, 3, 4, 3 }; 
        // Set demonstration using HashSet Constructor 
        //Set<Integer> set = new HashSet<>(Arrays.asList(arr)); 
	}
}
