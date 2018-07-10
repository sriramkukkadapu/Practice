import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import org.apache.commons.lang3.ArrayUtils;

//import com.google.common.primitives.Ints;

public class CoinsProblem {
public static void main(String args[])
{
	
	//min_coins(of number of coins possible)
	
	//if value is 0 = 0 number of coins required
	
	// check if given sum is < all provided coins then we cant produce the given sum
	
	//recursively check for each coin
	//check value by reducing the amount from coins
	
	
	//if after all the cycle if v is not 0(means we cant produce the amount)
	//dont check for min_coins value
	//(if current number of coins < min_coins)
		//then update min_coins to this combination
	
	List<Integer> list=new ArrayList<Integer>();
	//1 3 5 9 10, target 15
	list.add(1);
	list.add(3);
	list.add(5);
	list.add(9);
	list.add(6); 

	
	List<Integer> ActualList=new ArrayList(list);
	List<Integer> tempList;
	List<Integer> countList=new ArrayList<Integer>();
	
	
	//ActualList=list;
	//tempList=list;
	int actualTarget=8,quotient,rem,target=0;
	int count=0;
	
	printList(ActualList);
	System.out.println("Target is: "+actualTarget);
	while(!ActualList.isEmpty())
	{
		
		//list=ActualList;
		System.out.println("===>Iteration: ");
		Collections.sort(ActualList, Collections.reverseOrder());
		printList(ActualList);
		count=0;
		target=actualTarget;
		System.out.println("Target: "+target);
		list=new ArrayList<Integer>(ActualList);
		while(target!=0 )
			{
			
			System.out.println("element: "+getMaxFromList(list));
			rem=target%getMaxFromList(list);
			System.out.println("rem: "+rem);
			quotient=target/getMaxFromList(list);
			System.out.println("quotient: "+quotient);
			
			count=count+quotient;
			System.out.println("count: "+count);
			target=target-(quotient*getMaxFromList(list));
			System.out.println("new target: "+target);
			
			int ele=getMaxFromList(list);
			list.remove(Integer.valueOf(ele));
			
			if(rem==0 || list.isEmpty())
				{
					break;
				}

			}

		countList.add(count);
		System.out.println("count: "+count);
	
		int ele=getMaxFromList(ActualList);
		ActualList.remove(Integer.valueOf(ele));
		//printList(ActualList);
	
	}

	System.out.println("=====Count List======");
	printList(countList);
	
	
}





public static int getMaxFromList(List<Integer> list)
{
	int max=0;
	//int a[]= ArrayUtils.toPrimitive(list.toArray(new Integer[0]));
	//int a[]=Ints.toArray(list);
	int a[]=new int[list.size()];
	int i=0;
	for(Integer e:list) {
		a[i]=e;
		i++;
	}
	
	for(i=0;i<a.length;i++)
		if(max < a[i])
			max=a[i];
	
	return max;
	
	
}

public static void printList(List<Integer> list)
{
	System.out.print("List is: ");
	for(int e:list)
	{
		System.out.print(e+" ");
	}
	System.out.println("");
}
}
