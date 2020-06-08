import java.util.HashMap;
import java.util.Map;

public class DateDiff3 {
	
	public static Map<Integer,Integer> month_days_map;
	
public	static int day1=1; //24-5-2016
public	static int month1=2;
public  static int year1=2000;
	
public	static int day2=1; //1-6-2018
public	static int month2=2;
public	static int year2=2000;
	
public static void main(String args[])
{
	int days=0;
	init_monthdays_map();
	
	//current year current month days
	days=days+month_days_map.get(month1)-day1;
	System.out.println("this month remaining days: "+days);
	
	//now calc for remaining months in same year
	for(int i=month1+1;i<=12;i++) {
		System.out.println("adding days: "+month_days_map.get(i));
		days=days+month_days_map.get(i);
	}
	
	if(year2-year1>=2)
	{
		//just add 365/days for each year
		for(int i=year1+1;i<=year2-1;i++)
			if(i%4==0) {
				System.out.println("adding days 366 for year "+i);
				days=days+366;
				}
			else {
				System.out.println("adding days 365 for year "+i);
				days=days+365;
				}
	}
	
	//go to next year // if year2> year1
	if(year2>year1) {
	for(int i=1;i<=month2-1;i++) {
		System.out.println("adding days: "+month_days_map.get(i));
	days=days+month_days_map.get(i);
	}
}
	
	//last month rem dates just add
	System.out.println("adding rem days in last month: "+day2);
	days=days+day2;
	
	
	System.out.println("Total days: "+days);

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
