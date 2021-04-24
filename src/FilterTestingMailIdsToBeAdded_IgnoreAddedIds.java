
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class FilterTestingMailIdsToBeAdded_IgnoreAddedIds {
public static void main(String args[]) throws IOException
{
	//Read all mail ids from file
	
	FileInputStream fis_added=new FileInputStream("testing mail ids added.txt");  //Old mail ids which are al;ready added
	Set<String> old_hset=new LinkedHashSet<String>();
	String temp="",searchterm="risesharp";
	Set<String> uniqueIds=new HashSet<String> ();
	
	int b; char ch;
	
	int strlen=0;
	while((b=fis_added.read())!=-1)
	{
		ch=(char) b;

		if(ch==' ' || ch=='\n')
		{
			//if we get space means insert temp into set and make temp = empty again
			temp=temp.trim();

			old_hset.add(temp);
			temp="";
		}
		else
		{
			//non space char means keep on adding it to temp
			temp=temp+ch;
		}
		
		
	}
	
	
	old_hset.remove("");
	old_hset.remove(";");
	
	System.out.println("Testing mail ids already added Total: "+old_hset.size());
	FileInputStream fis_pending=new FileInputStream("testing mail ids pending.txt");  //Old mail ids which are al;ready added
	Set<String> pending_hset=new LinkedHashSet<String>();
	
	while((b=fis_pending.read())!=-1)
	{
		ch=(char) b;

		if(ch==' ' || ch=='\n')
		{
			//if we get space means insert temp into set and make temp = empty again
			temp=temp.trim();

			pending_hset.add(temp);
			temp="";
		}
		else
		{
			//non space char means keep on adding it to temp
			temp=temp+ch;
		}		
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