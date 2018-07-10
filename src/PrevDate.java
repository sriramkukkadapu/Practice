import java.util.HashMap;
import java.util.Map;

public class PrevDate {
	
	public static Map<Integer,Integer> month_days_map;
	
public	static int day1=29;
public	static int month1=2;
public  static int year1=2016;
	
	
public static void main(String args[])
{
	int total_days=0;
	//considering date1 is start and date2 is end date 
	init_monthdays_map();
	
	System.out.println("Given Inputs");
	System.out.println("Start Date: "+day1+"-"+month1+"-"+year1);

	
	increment_date();
	System.out.println("Next Date");
	System.out.println("Start Date: "+day1+"-"+month1+"-"+year1);
	
}

public static void increment_date() {
	if(day1==month_days_map.get(month1) && month1!=2) //means this is the last day on that month. increment month
	{
		if(month1!=12) //a normal month reached end
		{
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
	else if(day1>=month_days_map.get(month1) && month1==2) //feb month last day
	{
		//check leap year
		if(year1%4==0 && day1<=28)  //given day should be <=28 then only we can increment in case of leap year
			day1++; //inc day in feb thats it
		
		else if(year1%4==0 && day1==29) {
			day1=1;
			month1++;
		}
		else if(day1<=28) //non leap year, normal day increment as per last month of that day
		{
			day1=1;
			month1++;
		}
		else
		{
			System.out.println("Invalid date");
			System.exit(0);
		}
	}
	else if(day1<month_days_map.get(month1)) //just a normal day increment, dont change month
	{
		day1++;
	}
	else
	{	System.out.println("Invalid date");
	System.exit(0);}
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
