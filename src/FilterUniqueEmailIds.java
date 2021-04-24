import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class FilterUniqueEmailIds {
public static void main(String args[]) throws IOException
{
	//Read all mail ids from file Duplicates\\Emails.txt
	
	FileInputStream fis=new FileInputStream("testing mail ids pending.txt");
	Set<String> hset=new LinkedHashSet<String>();
	String temp="";
	
	int b; char ch;
	
	int strlen=0;
	while((b=fis.read())!=-1)
	{
		ch=(char) b;
		//System.out.print(ch);
		if(ch==' ' || ch=='\n')
		{
			//if we get space means insert temp into set and make temp = empty again
			temp=temp.trim();
			//System.out.println(temp);
			hset.add(temp);
			temp="";
		}
		else
		{
			//non space char means keep on adding it to temp
			temp=temp+ch;
		}
		
		
	}
	
	System.out.println("Total mail ids in hashset: "+hset.size());
	hset.remove("");
	Iterator<String> itr=hset.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
