import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserData{
int Id;
String Name;
String Address;
String PhoneNumber;
String Email;

UserData(int Id, String Name, String Address, String PhoneNumber, String Email){
	this.Id=Id;
	this.Name=Name;
	this.Address=Address;
	this.PhoneNumber=PhoneNumber;
	this.Email=Email;
}
@Override
public String toString() {
	String s="{\"Id\":"+Id +","
			+ "\"Name\":"+Name +","
			+ "\"Address\":"+Address +","
			+ "\"PhoneNumber\":"+PhoneNumber +","
			+ "\"Email\":"+Email 
			+ "}" +"\n";
	
	return s;
}
}

public class Print_JSON_Data {
public static void main(String args[]) throws IOException {
	//UserData user1=new UserData(1,"Sriram","Bangalore","9060109968","sriram@gmail.com");
	//System.out.println(user1.toString());
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Number of user profiles needed: ");
	int n=sc.nextInt();
	int option=0;
	System.out.println("Choose One option from below");
	System.out.println("1.Print Output to Console");
	System.out.println("2.Write Output to a file");
	System.out.println("Enter the Option you prefer: ");
	option=sc.nextInt();
	List<UserData> users=new ArrayList<UserData>();
	for(int i=1;i<=n;i++) {
		UserData user=new UserData(i,"User"+i,"State: AP, Zip: 533"+i,"9060109968","user"+i+"@gmail.com");
		users.add(user);
	}
	if(option==1)
	System.out.println(users);
	else if(option==2) {
	FileWriter myWriter = new FileWriter("userdata.txt");
	myWriter.write(users.toString());
    myWriter.close();
    System.out.println("Data as been written to file: userdata.txt");
	}
}
}
