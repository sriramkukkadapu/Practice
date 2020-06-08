import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CharacterCount {
public static void main(String args[])
{
	String s="abbcccdee";
	String temp="";
	Map<Character,Integer> hmap=new HashMap<Character,Integer>();
	
	System.out.println("String with unique characters: "+temp);
	
	for(int i=0;i<s.length();i++)
	{
		if(!temp.contains(s.charAt(i)+""))
				{
					temp=temp+s.charAt(i);
				}
				
	}
	
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(hmap.containsKey(c))
		{
			int count=hmap.get(c);
			count++;
			hmap.put(c,count);
		}
		else
			hmap.put(c,1);  //1st occurence
	}
	
	for(int i=0;i<temp.length();i++)
	{
		System.out.print(temp.charAt(i)+""+hmap.get(temp.charAt(i)));
	}
	
//	Set entrySet=hmap.entrySet();
//	Iterator itr=entrySet.iterator();
//	while(itr.hasNext())
//	{
//		Map.Entry mEntry=(Map.Entry)itr.next();
//		
//	}
	
}
}
