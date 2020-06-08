import java.util.HashMap;
import java.util.Map;


class Date 
{ 
    int d, m, y; 
}

public class DateDiff_ToMilliSeconds {

	
	public static int countLeapYears(Date d) 
	{ 
	    int years = d.y; 
	  
	    // Check if the current year needs to be considered 
	    // for the count of leap years or not 
	    if (d.m <= 2) 
	        years--; 
	  
	    // An year is a leap year if it is a multiple of 4, 
	    // multiple of 400 and not a multiple of 100. 
	    return years / 4 - years / 100 + years / 400; 
	} 
	
	public static int getDifference(Date dt1, Date dt2) 
	{ 
	    // COUNT TOTAL NUMBER OF DAYS BEFORE FIRST DATE 'dt1' 
		int monthDays[] = {31, 28, 31, 30, 31, 30, 
                31, 31, 30, 31, 30, 31}; 
	    // initialize count using years and day 
	     int n1 = dt1.y*365 + dt1.d; 
	  
	    // Add days for months in given date 
	    for (int i=0; i<dt1.m - 1; i++) 
	        n1 += monthDays[i]; 
	  
	    // Since every leap year is of 366 days, 
	    // Add a day for every leap year 
	    n1 += countLeapYears(dt1); 
	  
	    // SIMILARLY, COUNT TOTAL NUMBER OF DAYS BEFORE 'dt2' 
	  
	     int n2 = dt2.y*365 + dt2.d; 
	    for (int i=0; i<dt2.m - 1; i++) 
	        n2 += monthDays[i]; 
	    n2 += countLeapYears(dt2); 
	  
	    // return difference between two counts 
	    return (n2 - n1); 
	} 
	
public static void main(String args[])
{
	//considering date1 is old and date2 is after date1 
	
	int day1=24;
	int month1=4;
	int year1=2016;
	
	int day2=1;
	int month2=6;
	int year2=2016;
	
	Date dt1 = new Date();
	dt1.d=1; dt1.m=2; dt1.y=2000; 
    Date dt2 = new Date();
    dt2.d=1; dt2.m=2; dt2.y=2004;
    
    System.out.println(getDifference(dt1, dt2)); 
		
}

}
