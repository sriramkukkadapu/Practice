import java.util.Scanner;

public class CenturyLink_TimeDifference {
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter current time in format HH:MM:SS");
	String curr_timestamp=sc.next();
	int curr_h=Integer.parseInt(curr_timestamp.split(":")[0]);
	int curr_m=Integer.parseInt(curr_timestamp.split(":")[1]);
	int curr_s=Integer.parseInt(curr_timestamp.split(":")[2]);

	System.out.println("Enter Number of inputs to compare: ");
	int n= sc.nextInt();
	String p[]=new String[n];
	
	for(int i=0;i<n;i++) {
		System.out.println("Enter the Dest time in Format HH:MM:SS (Input:"+i+" )");
		p[i]  = sc.next();	
	}
	
	for(int i=0;i<n;i++) {

		String des_timestamp=p[i];
		int des_h=Integer.parseInt(des_timestamp.split(":")[0]);
		int des_m=Integer.parseInt(des_timestamp.split(":")[1]);
		int des_s=Integer.parseInt(des_timestamp.split(":")[2]);
		
		System.out.println("des_h: "+des_h);
		String diff_string = findDifference(curr_h,curr_m,curr_s, des_h,des_m,des_s);
		
		System.out.println(diff_string);
	}
}
	


public static String  findDifference(int curr_h, int curr_m, int curr_s,  int des_h,int des_m,int des_s) {
	
	int curr_seconds = (  (curr_h*60*60) + (curr_m)*60 )  + (curr_s); 
	int dest_seconds = (  (des_h*60*60) + (des_m)*60 )  + (des_s);
	int diff_seconds=dest_seconds-curr_seconds;
	
	int diff_h=diff_seconds/(60*60);
	diff_seconds=diff_seconds- (diff_h*60*60);
	int diff_m=diff_seconds/60;
	diff_seconds = diff_seconds- (diff_m*60);
	int diff_s=diff_seconds;
	
	//System.out.println("Difference String: "+ diff_h+":"+diff_m+":"+diff_s);
	
	String diff_string = diff_h+":"+diff_m+":"+diff_s;
	return diff_string;
}

}
