

import java.util.Scanner;

public class PrevNextDate_Jayanta {
    public static void main(String[] args) {

        //Given Input
        int inputDate, inputMonth, inputYear;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date (DD):");
        inputDate = sc.nextInt();
        System.out.println("Enter Month (MM):");
        inputMonth = sc.nextInt();
        System.out.println("Enter Year (YYYY):");
        inputYear = sc.nextInt();
        sc.close();

        //Converting int to String
        String date = String.valueOf(inputDate);
        String month = String.valueOf(inputMonth);
        String year = String.valueOf(inputYear);

        //Check if Input Year is Leap Year
        boolean leapYear = false;
        if (inputYear % 4 == 0) {
            if (inputYear % 100 == 0) {
                if (inputYear % 400 == 0)
                    leapYear = true;
                else
                    leapYear = false;
            } else
                leapYear = true;
        } else {
            leapYear = false;
        }

        //Check if Input Date is correct
        boolean dateCheck=false;
        if((inputDate>0 && inputDate<=31) && ((inputMonth == 1) || (inputMonth == 3) || (inputMonth == 5) || (inputMonth == 7) || (inputMonth == 8) || (inputMonth == 10) || (inputMonth == 12)))
        {
            dateCheck=true;
        }
        else if((inputDate>0 && inputDate<=30) && ((inputMonth == 4) || (inputMonth == 6) || (inputMonth == 9) || (inputMonth == 11)))
        {
            dateCheck=true;
        }
        else if(inputMonth ==2){
            if(leapYear=true && inputDate<=29)
               dateCheck=true;
        }
        else if(inputMonth ==2){
            if(leapYear=false && inputDate<=28)
                dateCheck=true;
        }
        else
            dateCheck=false;

        int nextDate, nextMonth, nextYear, previouDate, previousMonth, previousYear;

        if (dateCheck) {
            //Checking on Different Condition for Next Day
            if (date.equals("30") && (month.equals("4") || month.equals("6") || month.equals("9") || month.equals("11"))) {
                nextDate = 1;
                nextMonth = inputMonth + 1;
                nextYear = inputYear;
            } else if (date.equals("31") && (month.equals("1") || month.equals("3") || month.equals("5") || month.equals("7") || month.equals("8") || month.equals("10"))) {
                nextDate = 1;
                nextMonth = inputMonth + 1;
                nextYear = inputYear;
            } else if (date.equals("28") && month.equals("2") && (leapYear = true)) {
                nextDate = inputDate + 1;
                nextMonth = inputMonth;
                nextYear = inputYear;
            } else if (date.equals("28") && month.equals("2") && (leapYear = false)) {
                nextDate = 1;
                nextMonth = inputMonth + 1;
                nextYear = inputYear;
            } else if (date.equals("29") && month.equals("2") && (leapYear = true)) {
                nextDate = 1;
                nextMonth = inputMonth + 1;
                nextYear = inputYear;
            } else if (date.equals("31") && month.equals("12")) {
                nextDate = 1;
                nextMonth = 1;
                nextYear = inputYear + 1;
            } else {
                nextDate = inputDate + 1;
                nextMonth = inputMonth;
                nextYear = inputYear;
            }

            //Checking on Different Condition for Previous Day
            if (date.equals("1") && (month.equals("5") || month.equals("7") || month.equals("10") || month.equals("12"))) {
                previouDate = 30;
                previousMonth = inputMonth - 1;
                previousYear = inputYear;
            } else if (date.equals("1") && (month.equals("2") || month.equals("4") || month.equals("6") || month.equals("8") || month.equals("9") || month.equals("11"))) {
                previouDate = 31;
                previousMonth = inputMonth - 1;
                previousYear = inputYear;
            } else if (date.equals("1") && month.equals("1")) {
                previouDate = 31;
                previousMonth = 12;
                previousYear = inputYear - 1;
            } else if (date.equals("1") && month.equals("3") && (leapYear = true)) {
                previouDate = 29;
                previousMonth = inputMonth - 1;
                previousYear = inputYear;
            } else if (date.equals("1") && month.equals("3") && (leapYear = false)) {
                previouDate = 28;
                previousMonth = inputMonth - 1;
                previousYear = inputYear;
            } else {
                previouDate = inputDate - 1;
                previousMonth = inputMonth;
                previousYear = inputYear;
            }

            //Printing Next Date
            String nextDateDDMMYYYY = String.valueOf(nextDate) + "/" + String.valueOf(nextMonth) + "/" + String.valueOf(nextYear);
            System.out.println("*** Next Date (DD-MM-YYYY) is : " + nextDateDDMMYYYY + " ***");

            //Printing Previous Date
            String previousDateDDMMYYYY = String.valueOf(previouDate) + "/" + String.valueOf(previousMonth) + "/" + String.valueOf(previousYear);
            System.out.println("*** Previous Date (DD-MM-YYYY) is : " + previousDateDDMMYYYY + " ***");

        }
        else
            System.out.println("*** Provided Input Date (DD-MM-YYYY) is Incorrect ***");
    }

}
