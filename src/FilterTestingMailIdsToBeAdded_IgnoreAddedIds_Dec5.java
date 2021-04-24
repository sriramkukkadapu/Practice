
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class FilterTestingMailIdsToBeAdded_IgnoreAddedIds_Dec5 {
public static void main(String args[]) throws IOException
{
	//Read all mail ids from file
	
	//FileInputStream fis_added=new FileInputStream("fresher mail ids added.txt");  //Old mail ids which are al;ready added
	
	BufferedReader br_old = new BufferedReader(new InputStreamReader(
            new FileInputStream("testing mail ids added.txt")));
            
	Set<String> old_hset=new LinkedHashSet<String>();
	String temp="";
	Set<String> uniqueIds=new HashSet<String> ();
	
	int b; char ch;
	int c=1; //count just to print to console
	int strlen=0;
	String line;
	while((line = br_old.readLine()) != null)
	{
		old_hset.add(line);
		
		//System.out.println("Working on mail id: "+c);
		c++;
	}
	
	
	old_hset.remove("");
	old_hset.remove(";");
	
	System.out.println("Testing mail ids already added Total: "+old_hset.size());
	
	BufferedReader br_pending = new BufferedReader(new InputStreamReader(
            new FileInputStream("testing mail ids pending.txt")));
	Set<String> pending_hset=new LinkedHashSet<String>();
	
	while((line = br_pending.readLine()) != null)
	{
		pending_hset.add(line);
	}
	
	System.out.println("Total pending mail ids to be added: "+pending_hset.size());
	//now we have old hashset and pending hashset now iterate from pending hashset, check if email id exists in old hashset, 
	//then ignore it or else display it/add it in the tobeadded_hashset 
	
	Set<String> tobeadded_hset=new LinkedHashSet<String>();
	Iterator<String> itr=pending_hset.iterator();
	while(itr.hasNext()) {
		temp=itr.next();
		temp=temp.toLowerCase();
		
		if(old_hset.contains(temp)) {
			//ignore
		}
		else {
			tobeadded_hset.add(temp);
			System.out.println(temp);
		}
	}
	
	System.out.println("Total New Unique mail ids are: "+tobeadded_hset.size());
}
}