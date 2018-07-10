import java.util.HashMap;
import java.util.Map;

public class DateDiff {
	
	public static Map<Integer,Integer> month_days_map;
	
public static void main(String args[])
{
	//considering date1 is old and date2 is after date1 
	init_monthdays_map();
	int day1=24;
	int month1=4;
	int year1=2016;
	
	int day2=1;
	int month2=6;
	int year2=2016;
	
	int diff_days=diff_day(day1,day2,month1);
	System.out.println("diff b/w days="+diff_days);
	int diff_months=month2-month1;
	System.out.println("diff b/w months="+diff_months);
	if(diff_months>=2)
	{
		
		days_bw_months(month1+1,month2);
	}
	//int days_by_months=days_diff_by_months(int month1,int month2);
		
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
