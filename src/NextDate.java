import java.util.HashMap;
import java.util.Map;

public class NextDate {
	
	public static Map<Integer,Integer> month_days_map;
	
public	static int day1=1;
public	static int month1=3;
public  static int year1=2016;
	
	
public static void main(String args[])
{
	int total_days=0;
	//considering date1 is start and date2 is end date 
	init_monthdays_map();
	
	System.out.println("Given Inputs");
	System.out.println("Start Date: "+day1+"-"+month1+"-"+year1);

	
	decrement_date();
	System.out.println("Previous Date");
	System.out.println(day1+"-"+month1+"-"+year1);
	
}

public static void decrement_date() {
	if(day1==1 && month1!=3) //means this is the first day of the month
	{
		if(month1!=1) //a normal month first needs to go back
		{
			month1--; //dec month
			day1=month_days_map.get(month1);
		}
		
		else if(month1==1) //go to previous year dec 31
		{
			month1=12;
			day1=month_days_map.get(month1);
			year1--;
		}
	}
	else if(day1==1 && month1==3) //mar 1st
	{
		month1--;
		//check leap year
		if(year1%4==0)
			day1=29;
		
		else 
			day1=28;
			
	}
	else //normal case
	{
		day1--;
	}
}


public static void init_monthdays_map()
{
	month_days_map=new HashMap<Integer,Integer>();
	month_days_map.put(1, 31);
	month_days_map.put(2,28);
	month_days_map.put(3,31);
	month_days_map.put(4,30);
	month_days_map.put(5,31);
	month_days_map.put(6,30);
	month_days_map.put(7,31);
	month_days_map.put(8,31);
	month_days_map.put(9,30);
	month_days_map.put(10,31);
	month_days_map.put(11,30);
	month_days_map.put(12,31);
}
}
