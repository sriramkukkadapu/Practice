import java.util.Scanner;

public class cgi_program5 {
public static void main(String args[])
{
	//6 30 50
	//29 38 12 48 39 55
	
	//38 48 39   (print which falls in the distance)
	
	Scanner sc=new Scanner(System.in);
	String data = sc.nextLine();
	int start = Integer.parseInt(data.split(" ")[1]);
	int end = Integer.parseInt(data.split(" ")[2]);
	String distances = sc.nextLine();
	
	for(int i=0;i<distances.split(" ").length;i++) {
		int curr_dis = Integer.parseInt(distances.split(" ")[i]);
		if(curr_dis >= start && curr_dis <=end) {
			System.out.print(curr_dis+" ");
		}
	}
	
	
}
}
