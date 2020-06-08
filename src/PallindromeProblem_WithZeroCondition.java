import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PallindromeProblem_WithZeroCondition {
public static void main(String args[]) throws NumberFormatException, IOException
{
	char chars[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
	int nos[]= {1,2,3,4,5,6,7,8,9,0};
	char sp[]= {'!','@'};
	int l,a,n,s;
	int nc,nn,ns; //nc=no of chars, nn=no of nos, ns=no of sp chars
	char c='!';
	char extraChar='\u0000';
	String temp=""; char cat='\u0000';
	
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	
	System.out.print("Enter value for length - l= ");
	l=Integer.parseInt(br.readLine());
	
	System.out.print("Enter count for alphabets - a= ");
	a=Integer.parseInt(br.readLine());
	
	System.out.print("Enter count for numbers - n= ");
	n=Integer.parseInt(br.readLine());
	
	System.out.print("Enter count for sp.chars - sp= ");
	s=Integer.parseInt(br.readLine());
	
	int addonechar=0;
	
	if(a+n+s!=l) {
		System.out.println("Invalid Pallindrome");
		System.exit(0);
		}
	else if(a==0||n==0||s==0)
	{
		System.out.println("Input should be Non Zero values");
		System.exit(0);
	}
	
	if(l%2==0) { //even length string case
		nc=a/2;
		nn=n/2;
		ns=s/2;
			
			for(int i=0;i<nc;i++)
				temp=temp+chars[i];

			for(int i=0;i<nn;i++)
				temp=temp+nos[i];

			for(int i=0;i<ns;i++)
				temp=temp+sp[i];
		
		if(a==1) extraChar='z';
		if(n==1) extraChar='0';
		if(s==1) extraChar='!';
		
		//System.out.println(temp);
		StringBuffer sb=new StringBuffer(temp);
		if(a==1||n==1||s==1)
			temp=temp+extraChar+sb.reverse().toString();
		else
			temp=temp+sb.reverse().toString();
		if(temp.length()!=l)
			System.out.println("Invalid Pallindrome");
		System.out.println(temp);
	}
	
	else // odd length string case
	{		
		//find which category is odd number 
		int countOfCat=0;
		if(a%2!=0) 
		{
			countOfCat++;
			cat='a';
			extraChar='z';
		}
		if(n%2!=0)
		{
			countOfCat++;
			cat='n';
			extraChar='0';
		}
		if(s%2!=0)
		{
			countOfCat++;
			cat='s';
			extraChar='#';
		}
		
		if(countOfCat>2)
		{
				System.out.println("Invalid Pallindrome");
				System.exit(0);
		}
		
		//now just normally form the string and print that
			nc=a/2;
			nn=n/2;
			ns=s/2;
			//int limit;
			
				for(int i=0;i<nc;i++)
					temp=temp+chars[i];
			
				for(int i=0;i<nn;i++)
					temp=temp+nos[i];
			
				for(int i=0;i<ns;i++)
					temp=temp+sp[i];
			
		
		System.out.println(temp);
		temp=temp;
		StringBuffer sb=new StringBuffer(temp);
			temp=temp+extraChar+sb.reverse().toString();
			
			if(temp.length()!=l)
				System.out.println("Invalid Pallindrome");
		System.out.println(temp);
		
	}
	
}
}
