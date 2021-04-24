
import java.util.Arrays;
import java.util.List;

public class Calendar_Vineet {

    static List<String> monthList = Arrays.asList(new String[]{"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"});

    public static String changeMonth(String month, String value) {

        int currIndex = monthList.indexOf(month);

        if (value.equalsIgnoreCase("next")) {

            return monthList.get(currIndex + 1);

        } else {

            return monthList.get(currIndex - 1);
        }


    }

    static int prevDay;
    static String prevMonth;
    static int prevYear;
    static int nextDay;
    static String changeMonth;
    static int nextYear;

    public static void main(String arr[]) throws Exception {

        String date = "28th February 2019";

        String dateArr[] = date.split(" ");
        String day = dateArr[0].substring(0,dateArr[0].length()-2);
        String month = dateArr[1];
        String year = dateArr[2];


        int limit = limitOfMonth(month, year);
        
        if (Integer.parseInt(day) > limit || !monthList.contains(month)) {
            throw new Exception("invalid date");
            
        } else if (Integer.parseInt(day) == limit && month.equals("December")) {
            prevDay = Integer.parseInt(day) - 1;
            nextDay = 1;
            prevMonth = month;
            prevYear = Integer.parseInt(year);
            changeMonth = "January";
            nextYear = Integer.parseInt(year) + 1;
        } else if (Integer.parseInt(day) == limit) {
            prevDay = Integer.parseInt(day) - 1;
            nextDay = 1;
            prevMonth = month;
            prevYear = Integer.parseInt(year);
            changeMonth = changeMonth(month, "next");
            nextYear = Integer.parseInt(year);
        } else if (Integer.parseInt(day) == 1 && month.equals("January")) {
            prevDay = 31;
            nextDay = Integer.parseInt(day) + 1;
            prevMonth = "December";
            prevYear = Integer.parseInt(year) - 1;
            changeMonth = month;
            nextYear = Integer.parseInt(year);
        } else if (Integer.parseInt(day) == 1) {
            prevMonth = changeMonth(month, "prev");
            prevDay = limitOfMonth(prevMonth, year); 
            nextDay = Integer.parseInt(day) + 1;
            prevYear = Integer.parseInt(year);
            changeMonth = month;
            nextYear = Integer.parseInt(year);
            
        } else {
            prevDay = Integer.parseInt(day) - 1;
            nextDay = Integer.parseInt(day) + 1;
            prevMonth = changeMonth = month;
            prevYear = nextYear = Integer.parseInt(year);
        }

        System.out.println("Previous Date: " + withSuffix(prevDay) + " " + prevMonth + " " + prevYear);

        System.out.println("Current Date:" +" " + date);
        
        System.out.println("Next Date: " + withSuffix(nextDay) + " " + changeMonth + " " + nextYear);
    }

    public static String withSuffix(int dayOfdate) {
        String day = String.valueOf(dayOfdate);
        if (day.endsWith("1")) {
            return day + "st";
        } else if (day.endsWith("2")) {
            return day + "nd";
        } else if (day.endsWith("1")) {
            return 3 + "rd";
        } else {
            return day + "th";
        }

    }

    public static int limitOfMonth(String month, String year) {

        List<String> month31Days = Arrays.asList(new String[]{"January", "March", "May", "July", "August", "October", "December"});
        List<String> month30Days = Arrays.asList(new String[]{"April", "June", "September", "November"});

        if (month30Days.contains(month)) {
            return 30;

        } else if (month31Days.contains(month)) {

            return 31;

        } else if (month.equals("February")) {

            if (leapYearCheck(year)) 
            	return 29;
            else return 28;

        } 
   
         return 0;
         
    }
    
    
    

    public static boolean leapYearCheck(String year) {

        if (Integer.parseInt(year) % 4 == 0) {
            return true;
        }

        else if(Integer.parseInt(year) % 100 == 0){

            return false;
        }
        else if(Integer.parseInt(year) % 400 == 0){

            return true;
        }
        else {

            return false;
        }

    }
}
