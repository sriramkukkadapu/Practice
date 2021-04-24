
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DateFun_SwatiJain {
	static int a,b ,num , prevNum , nextNum;
	static boolean year =true;
	static ArrayList<Integer>PrevDate = new ArrayList<Integer>();
	static ArrayList<Integer>NextDate = new ArrayList<Integer>();
	public static void main(String args[])
	
	{
		DateFun_SwatiJain.LeapYear();
		DateFun_SwatiJain.month(b);
		System.out.println(PrevDate);
		System.out.println(NextDate);
	}
	
	public static void LeapYear()
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		b= sc.nextInt();		
		
		if((b%4==0||b%400==0)&&!(b%100==0))
		{
		System.out.println(b +" is a leap year");
		year= true;	
		}
		
		else 
		{
			System.out.println(b+" not a leap year");
		year = false;
		}
	}
	
	public static void month(int b)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Month : ");
		a = sc1.nextInt();	
		
		HashMap<Integer, Integer> monthDays = new HashMap<Integer, Integer>();
		monthDays.put(1, 31);
		
		if(year==false){
		monthDays.put(2, 28);
		}
		else
		{
			monthDays.put(2, 29);
		}
		monthDays.put(3, 31);
		monthDays.put(4, 30);
		monthDays.put(5, 31);
		monthDays.put(6, 30);
		monthDays.put(7, 31);
		monthDays.put(8, 31);
		monthDays.put(9, 30);
		monthDays.put(10, 31);
		monthDays.put(11, 30);
		monthDays.put(12, 31);
		
		System.out.println("Enter the Number : ");
		num= sc1.nextInt();
		boolean invalid=true;
		while(invalid=true)
		{
			if(a==2)
			{
				if((year==false)&&(num>28||num<1))
				{
				
					System.out.println("invalid date");
					System.out.println("Enter the Number : ");
					num=sc1.nextInt();			 			
				}
			if((year=true)&&(num>29||num<1))
				{
				
					System.out.println("invalid date");
					System.out.println("Enter the Number : ");
					num=sc1.nextInt();						 
				}
			else
			{
				invalid=false;
				System.out.println("valid date");
				break;
			}	
			}
			
			else if((num>31||num<1)&&!(a==2)) 
				{
					System.out.println("invalid date");
					System.out.println("Enter the Number : ");
					num=sc1.nextInt();						 
				}				
				
			
			else
			{
				invalid=false;
				System.out.println("valid date");
				break;
			}	
		}	 
			if(num==1)
			{
				if(a==1)
				{
				prevNum=monthDays.get(12);
				nextNum=num+1;
				
				PrevDate.add(prevNum);
				PrevDate.add(12);
				PrevDate.add(b-1);	
				
				NextDate.add(nextNum);
				NextDate.add(a);
				NextDate.add(b);
				}
				
				else
				{
				prevNum=monthDays.get(a-1);
				nextNum=num+1;
				
				PrevDate.add(prevNum);
				PrevDate.add(a-1);
				PrevDate.add(b);
				
				NextDate.add(nextNum);
				NextDate.add(a);
				NextDate.add(b);
				
				}
			
			}
			else if(num==monthDays.get(a))
			{

				if(a==12)
				{				
				prevNum=num-1;
				nextNum=1;
				PrevDate.add(prevNum);
				PrevDate.add(a);
				PrevDate.add(b);
				
				NextDate.add(nextNum);
				NextDate.add(1);
				NextDate.add(b+1);

				}
				
				else
				{
					prevNum=num-1;
					nextNum=1;
					
					PrevDate.add(prevNum);
					PrevDate.add(a);
					PrevDate.add(b);
					
					NextDate.add(nextNum);
					NextDate.add(a+1);
					NextDate.add(b);
				}
		
			}
			
			else
			{
				prevNum =num-1;
				nextNum=num+1;
				
				PrevDate.add(prevNum);
				PrevDate.add(a);
				PrevDate.add(b);
				
				NextDate.add(nextNum);
				NextDate.add(a);
				NextDate.add(b);
			}
		
		}
}