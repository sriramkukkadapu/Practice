
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class FilterSpecificCompany {
public static void main(String args[]) throws IOException
{
	//Read all mail ids from file
	
	FileInputStream fis=new FileInputStream("hr mail ids.txt");  // Duplicates/Emails.txt
	Set<String> hset=new LinkedHashSet<String>();
	String temp="",searchterm="@pwc";
	Set<String> uniqueIds=new HashSet<String> ();
	
	int b; char ch;
	
	int strlen=0;
	while((b=fis.read())!=-1)
	{
		ch=(char) b;

		if(ch==' ' || ch=='\n')
		{
			//if we get space means insert temp into set and make temp = empty again
			temp=temp.trim();

			hset.add(temp);
			temp="";
		}
		else
		{
			//non space char means keep on adding it to temp
			temp=temp+ch;
		}
		
		
	}
	
	
	hset.remove("");
	hset.remove(";");
	Iterator<String> itr=hset.iterator();
	searchterm=searchterm.toLowerCase();
	while(itr.hasNext())
	{
		temp=itr.next();
		temp=temp.toLowerCase();
		if(temp.contains(searchterm)==true)
		{
			temp=temp.replace(';', ' ');
			temp=temp.trim();
			uniqueIds.add(temp);
		}
		//System.out.println(temp);
	}
	
	itr=uniqueIds.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}