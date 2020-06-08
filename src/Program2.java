/* IMPORTANT: Multiple classes and nested static classes are supported */

//uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Program2 {
    public static void main(String args[] ) throws Exception {
        // Sample code to perform I/O:
        // Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();                // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        
        // String name = s.nextLine();                 // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        for(;;)
        {
            if(minimizable(s)==true)
                {
                    System.out.println("Before minimize: "+s);
                    s=minimize(s);
                    System.out.println("After mninimize: "+s);
                }
            else
                break;
        }
        System.out.println(s.length());
        // Write your code here

    }
    
    public static String minimize(String s)
    {
        int len=s.length(); //len=10
        int mid=len/2; //mid = 5

        if(len%2==0){
        String part1=s.substring(0,mid); //from 0-4
        System.out.println(part1);
        String part2=s.substring(mid,len); //from 5-9
        System.out.println(part2);
        int i=0,j=0;
        int part1_len=mid-1;
        System.out.println(part1_len);
        int part2_len=mid;
        System.out.println(part2_len);
        // for(i=mid-1,j=mid;i>=0&&j<len;i--,j++)
        // {
            char c=part1.charAt(part1.length()-1);
            System.out.println("Char in middle is: "+c);
            for(int k=mid-1;part1.charAt(k)==c;k--){
                part1_len--;
            }
            System.out.println("remove part1 till: "+part1_len);
            for(int k=0;part2.charAt(k)==c;k++){
                part2_len++;
            }
            System.out.println("remove part2 till: "+part2_len);
            
            //if(len%2==1) //odd length string
            
            part1=s.substring(0,part1_len);
            part2=s.substring(part2_len,len);
            return (part1+part2);
       // }
        }
        else
        {
           //if length is odd just ignore center character
           String part1=s.substring(0,mid-1);
           String part2=s.substring(mid+1,len-1);
           return part1+part2;
        }
    }
     public static boolean minimizable(String s)
     {
        int len=s.length()/2;
        if(len%2==1)
            return true;
        else
        {
            int mid=len/2;
            if(s.charAt(mid)==s.charAt(mid+1))
            return true;
            else
            return false;
        }
     }
}
