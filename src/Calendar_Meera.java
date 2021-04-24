import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Calendar_Meera {
	int day;
	String month ="";
	int year;
	int lastDayofMonth;
	
	String previousDay="";
	String nextDay="";
	boolean suffixExist=true;
	String datefetched="";
	String[] Month1 = {"January","March","May","July","August","october","December"};
	String[] Month2 = {"April","June","September","November"};
	HashMap<String,Integer> hm = new HashMap<String, Integer>();
	
	// consturctor to initialize and get prerequisites
	
	Calendar_Meera() {
		
        Scanner in = new Scanner(System.in);
	    System.out.println("Enter a Date in the format of (Day Month Year)");
	    System.out.println("(eg: 12 March 2019/12th March 2019)");
	    datefetched = in.nextLine();
	    if(datefetched.isEmpty()) {
	    	System.out.println("Please provide the date value");
	    	  datefetched = in.nextLine();
	    }
	    
          hm.put("January", 1);
          hm.put("February",2);
          hm.put("March", 3);
          hm.put("April", 4);
          hm.put("May", 5);
          hm.put("June", 6);
          hm.put("July", 7);
          hm.put("August", 8);
          hm.put("September",9);
          hm.put("October",10);
          hm.put("November",11);
          hm.put("December", 12);
  
	}
	
	//method to get Month using Hash Map value
	public String getMonth(int monthValue) {
		String month="";
		 for(Entry<String, Integer> entry : hm.entrySet()) {
       	  String key = entry.getKey();
       	  Integer value = entry.getValue();
       	  if(value.equals(monthValue)) {
       		 month=entry.getKey();
       		 break;
       	  }
       	}
		 return month;   
	}
	
	//Method to fetch the last day of the month for leap year and normal year
	public int getLastDayofMonth(String month) {
		 List<String> list1 = Arrays.asList(Month1);
        if(month.equalsIgnoreCase("February")) {
          lastDayofMonth=((year%4==0)&&(year%100!=0))?29:28;  	 
        }
        else {
        lastDayofMonth=list1.contains(month)?31:30;
        } 
        return lastDayofMonth;
	}
	
	//method to fetch previous date from the given date
	public void getPreviousDate() {
		String previousDayMonth="";
		int previousDayDate;
		int previousDayYear;
		
		//if current date is the first day of the month
		if(day==1) {	
			//if current date is the first day of the year
			if(hm.get(month)==1) {
			previousDayMonth=getMonth(hm.size());
			previousDayYear=year-1;
			previousDayDate=getLastDayofMonth(previousDayMonth);
			}
			else {
				previousDayMonth=getMonth(hm.get(month)-1);	
				previousDayYear=year;
				previousDayDate=getLastDayofMonth(previousDayMonth);
			}	
		}
		else {
			previousDayMonth=month;
			previousDayYear=year;	
			previousDayDate=day-1;	
		}
		previousDay=suffixdisplay(previousDayDate)+" "+previousDayMonth+" "+ String.valueOf(previousDayYear);
		System.out.println(previousDay);

	}
	
	//method to fetch next date from the given date
	public void getNextDate() {
		String nextDayMonth="";
		int nextDayDate;
		int nextDayYear;
			
		//if current date is the last day of the month
		if(day==getLastDayofMonth(month)) {	
			
			//if current date is last day of the year
			if(hm.get(month)==hm.size()) {
				nextDayMonth=getMonth(1);
				nextDayYear=year+1;
			    nextDayDate=1;
			}
			else {  
				nextDayMonth=getMonth(hm.get(month)+1);	
				nextDayYear=year;
				nextDayDate=1;
			}	
		}
		else {
			nextDayMonth=month;
			nextDayYear=year;	
			nextDayDate=day+1;	
			
		}
		nextDay=suffixdisplay(nextDayDate)+" "+nextDayMonth+" "+ String.valueOf(nextDayYear);
		System.out.println(nextDay);
	}
	
	//Method to check for the given date is valid
	public Boolean checkValidDate() {
		Boolean flag=true;
		int valid=0;
		String check="";
		
		if(!datefetched.isEmpty()) {
			String[] arrOfStr =datefetched.split(" ");
			if(arrOfStr.length==3) {
			suffixExist=arrOfStr[0].length()>2?true:false;
			day=(arrOfStr[0].length()>2)?Integer.parseInt(arrOfStr[0].substring(0, arrOfStr[0].length()-2)):Integer.parseInt(arrOfStr[0]);
			month =arrOfStr[1];
			month=month.substring(0, 1).toUpperCase() + month.substring(1);
			year =Integer.parseInt(arrOfStr[2]);
		if(!(hm.containsKey(month))) {
           check="Month";
           flag=false;
           valid++;
		}
		if(!(day>0 && day<=getLastDayofMonth(month))) {
			 check="Day";
			 flag = false;
			 valid++;
		}
		if(!((year>0)&& (year<9999)) ) {
			 check="Year";
			 flag = false;
			  valid++;
		}
		if(valid==1) {
		System.out.println("Invalid "+check+" specified");
		}
		if(valid>1) {
			System.out.println("Specify a valid Date");	
		}
			}
		else
		{
			System.out.println("No Valid Date provided");
			flag=false;
		}
		}
		else
		{
			System.out.println("No Valid Date provided");
			flag=false;
		}
		return flag;
	}
	
	public String suffixdisplay(int day) {
		String suffix="";
		if(suffixExist) {
		if (day >= 11 && day <= 13)
        {
            suffix="th";
        }
        switch (day % 10)
        {
            case 1:  suffix = "st";
            break;
            case 2:  suffix ="nd";
            break;
            case 3:  suffix ="rd";
            break;
            default: suffix ="th";
        }
		}
        return day+suffix;
	}
	
	
	public static void main(String args[]) {
		Calendar_Meera a=new Calendar_Meera();
		if(a.checkValidDate()==true) {
		a.getNextDate();
		a.getPreviousDate();
		}	
	}

}
