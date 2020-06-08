import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hackerrank_tw_problem {
public static void main(String args[])
{
	String str="aabbccc";
	int ops=0;
	Map<Character,Integer> charcount=new HashMap<Character,Integer>();
	
	for(int i=0;i<str.length();i++)
	{
		char c=str.charAt(i);
		if(charcount.containsKey(c))
		{
			int count=charcount.get(c);
			count++;
			charcount.put(c, count); //incrementing count
		}
		else
			charcount.put(c, 1); //1st occurance
	}
	
	System.out.println(Collections.singletonList(charcount));
	System.out.println("a="+charcount.get('a'));
	System.out.println("b="+charcount.get('b'));
	System.out.println("c="+charcount.get('c'));
	
	Set<Character> set_char=charcount.keySet();	
	Set set_count=new HashSet<Integer>();
	
	Iterator itr=set_char.iterator();
	while(itr.hasNext())
	{
		char c = (char) itr.next();
		System.out.println("Adding couunt to count array: "+c+"="+charcount.get(c));
		set_count.add(charcount.get(c));
	}
	
	
	System.out.println("No of operations: "+set_count.size()); 
	
}
}
