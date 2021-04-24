import java.util.Scanner;
import java.util.*;

public class Calendar_Gireesh 

{
	int index=0;
 public static void main(String[] arg)
 {
	 Calendar_Gireesh d=new Calendar_Gireesh();
	 
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter Month");String month= in.nextLine();
	 System.out.println("Enter Date");int date=in.nextInt();
	 System.out.println("Enter year"); int year = in.nextInt();   
	 
	
	  if(year%4==0) //To check Leap year
	  {
		  //Leap year
		  if(date<=0||date>31)
		  {
			  System.out.println("Invalid Date");
		  }
		  else d.data(month, year, date,1);
	  }
	  
	  else
		  // Non Leap Year
		  d.data(month, year, date, 0);
}
 
 public void data(String month, int year, int date, int extraDay)
 {
	 
	 HashMap<String,Integer> map=new HashMap<String,Integer>();
	 map.put("january", 31);
	 map.put("february", 28+extraDay);
	 map.put("march", 31);
	 map.put("april", 30);
	 map.put("may", 31);
	 map.put("june", 30);
	 map.put("july", 31);
	 map.put("august", 31);
	 map.put("septemper", 30);
	 map.put("october", 31);
	 map.put("november", 30);
	 map.put("december", 31);
	 
	 ArrayList<String> months=new ArrayList<String>();
	 months.add("january");months.add("february");months.add("march");months.add("april");months.add("may");months.add("june");months.add("july");months.add("august");months.add("september");months.add("october");months.add("november");months.add("december");
	 
	 if(map.containsKey(month.toLowerCase()))
	 {
		 int days=map.get(month);
		 //If date is December 31st
		 if(month.equals("december")&&date==31)
		 {
			 previousDay(month, date-1, year);
			 nextDay(months.get(0), 1, year+1);
		 }
		 //If date is January 1st
		 else if(month.equals("january")&&date==1)
		 {
			 previousDay(months.get(months.size()-1), map.get("december"), year-1);
			 nextDay(month, date+1, year);
			 
		 }

		 else
		 {
			 if(date>days) 
			 {
				 System.out.println("Invalid date in "+ month+" month");
			 }
			 else if(date==days) //For MonthEnd
			 {
				 previousDay(month, date-1, year);
				 index=months.indexOf(month);	
				 nextDay(months.get(index+1), 1, year);
				 
			 }
			 else if(date==1) // 1st of every month except January
			 {
				 index=months.indexOf(month);
				 previousDay(months.get(index+1), map.get(months.get(index+1)), year);
				 nextDay(month, date+1, year);
			 }
			 else //for remaining days
			 {
				 previousDay(month, date-1, year);
				 nextDay(month, date+1, year);
				 
			 }
		 }
	 }
	 else
		 System.out.println("Invalid Month");
 }
 
 
 public void previousDay(String month, int date, int year)
 {
	 System.out.println("Previous day is: "+ date+" "+month+" "+year);
 }
 public void nextDay(String month, int date, int year)
 {
	 System.out.println("Next day is: "+ date+" "+month+" "+year);
 }
 
}
