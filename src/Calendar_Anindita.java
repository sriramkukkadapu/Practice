

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_Anindita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter date in DD-MM-YYYY format");
	String date = scan.next();
	String[] d = date.split("-");
	scan.close();
	int day = Integer.parseInt(d[0]);
	int  month = Integer.parseInt(d[1]);
	long year = Integer.parseInt(d[2]);
	int previousday=0,previousmonth=0, nextday=0,nextmonth=0;
	long previousyear=0;
	if(day<=0 || month<=0 || year<=0) {
		System.out.print("Invalid data entered");
		System.exit(0);
	}
	System.out.println(day+" "+month+" "+year);
	switch(month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
		if (day ==31)
			{nextday = 1;
			nextmonth = month+1;
		previousday =day-1;
		previousmonth=month;
		previousyear=year;
			}
		
		else if(day>01 && day<31)
		{ nextday=day+1;
		nextmonth=previousmonth=month;
	 previousday = day -1;
	 previousyear=year;
		}
		else
			System.out.println("Invalid day");
			
	break;
		
	case 02:
		if (year%4==0) {
			if(day==29) {
				nextmonth=month+1;
				previousday=day-1;
				nextday=1;
				previousmonth=month;
				previousyear=year;
			}else {
				nextmonth=previousmonth=month;
				nextday=day+1;
				previousday=day-1;
				previousyear=year;
				
			}
			
		}else {
			if(day==28) {
				nextday=1;
				previousday=day-1;
				nextmonth= month+1;
				previousmonth=month;
				previousyear=year;
			}
			else if(day>1 && day<28) {
				nextday=day+1;
				nextmonth= previousmonth=month;
				previousday=day=-1;
				previousyear=year;
			}else
				System.out.println("Invalid day");
			
		}
		break;
			
	case 4:
	case 6:
	case 9:
	case 11:
		
		previousyear=year;
		if(day==30) {
			nextday=1;
			previousday=day-1;
			nextmonth= month+1;
			previousmonth=month;
			
			
		}
		else if(day>1 && day<30) {
			nextday=day+1;
			nextmonth= previousmonth=month;
			previousday=day=-1;
		}
		else
			System.out.println("Invalid day");
		break;
		
	case 12:
		year=year+1;
		if(day==31) {
			nextday=1;
			previousday=day-1;
			nextmonth=1;
			previousmonth=month;
			previousyear=year-1;
		}
		else if(day>1 && day<31) {
			nextday=day+1;
			nextmonth= previousmonth=month;
			previousday=day-1;
		}
		else 
			System.out.println("Invalid day");
		break;
		
		default:
			System.out.print("Invalid month");
	
			
	}
	
	
	System.out.println("NextDate:"+nextday+"-"+nextmonth+"-"+year);
	System.out.println("PreviousDate:"+previousday+"-"+previousmonth+"-"+previousyear);
		

	}

}
