import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sureify {
public static void main(String args[]) {
//	
//	StringBuilder sb=new StringBuilder("abcab");
//	StringBuilder temp=sb;
//	int count=0;
//	for(int i=0;i<sb.length();i++)
//	{
//		for(int j=i+1;j<sb.length();j++) {
//			if(sb.charAt(i)==sb.charAt(j)) {
//				//.deleteCharAt(i);
//				count++;
//			}
//		}
//	}
//	
//	System.out.println(count);
	
	
	
	List<String> name=new ArrayList<String>();
	List<String> final_names=new ArrayList<String>();
	
	List<Integer> price=new ArrayList<Integer>();
	List<Integer> weight=new ArrayList<Integer>();
	
	name.add("ball");
	name.add("box");
	name.add("ball");
	name.add("ball");
	name.add("box");
	
	
	
	price.add(2);
	price.add(2);
	price.add(2);
	price.add(2);
	price.add(2);
	
	weight.add(1);
	weight.add(2);
	weight.add(1);
	weight.add(1);
	weight.add(3);
	
	Iterator itr=name.iterator();
	Iterator itr2=name.iterator();
	
	int i=0;
	int count=0;
	while(itr.hasNext() && i<name.size()) {
		
		int i2=1;
		while(itr2.hasNext() && i2<name.size()) {
			if(itr.next().equals(itr2.next())) {
				//check price
				if(price.get(i2)==price.get(i)) {
					//check weight
					if(weight.get(i2)==price.get(i)) {
						//name.remove(i2); //means 
						count++;
					}
				}
			}
			i2++;
		}
		
		i++;
	}
	
	System.out.println(count);
	
	
}
}
