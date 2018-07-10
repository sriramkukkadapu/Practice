import java.util.HashMap;
import java.util.Map;

public class DateDiff2 {
	
	public static Map<Integer,Integer> month_days_map;
	
public	static int day1=1; //24-5-2016
public	static int month1=2;
public  static int year1=2000;
	
public	static int day2=1; //1-6-2018
public	static int month2=2;
public	static int year2=2004;
	
public static void main(String args[])
{
	int total_days=0;
	//considering date1 is start and date2 is end date 
	init_monthdays_map();
	
	System.out.println("Given Inputs");
	System.out.println("Start Date: "+day1+"-"+month1+"-"+year1);
	System.out.println("End Date: "+day2+"-"+month2+"-"+year2);
	
	for(;;)
	{
		if(year1%4==0)
			month_days_map.put(2, 29);
		else
			month_days_map.put(2, 28);
		
		increment_date();
		total_days++;
		if(check_dates()==true) //dates equal
			break;
	}
	
	System.out.println("Total Number of days: "+total_days);
}

public static void increment_date() {
	if(day1==month_days_map.get(month1)) //means this is the last day on that month. increment month
	{
		if(month1!=12) //&& month1!=2) //normal month reached end
		{
			//check leap year here later
			month1++;
			day1=1;
			
		}
		else if(month1==12) //last day of year
		{
			month1=1;
			day1=1;
			year1++;
		}
	}
	else //just a normal day increment, dont change month
	{
		day1++;
	}
}

public  static boolean check_dates()
{
	
	if((day1==day2)&&(month1==month2)&&(year1==year2))
	return true;
	
	else
		return false;
	
}

public static int days_bw_months(int m1,int m2)
{
	int days=0;
	
	for(int i=m2;i>=m1;i--)
		days=days+month_days_map.get(i);
			
	System.out.println("days in b/w months "+m1+" and "+m2+"is "+days);
	
	return days;
}

public static int diff_day(int d1,int d2,int m1)
{
	int diff=0;
	if(d1 > d2)
		diff=(Integer.parseInt(month_days_map.get(m1).toString())-d1)+d2;
	else
		diff=d2-d1;
	
	return diff;
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
