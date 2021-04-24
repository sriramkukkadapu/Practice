
public class ClumpsInArray {
public static void main(String args[])
{
//	A ""clump"" in an array is a series of 2 or more adjacent elements of the same value. 
//	Ex1: clumps([1, 2, 2, 3, 4, 4]) → 2
//	Ex2: clumps([1, 1, 2, 1, 1]) → 2
//	Ex3: clumps([1, 1, 1, 1, 1]) → 1
//	Ex4: clumps([3, 4, 4, 4, 5]) → 1
//	Ex5: clumps([8, 8, 6, 6, 5, 5]) → 3
//	Ex6: clumps([10, 9, 8, 7, 6, 6, 5, 4, 4, 4, 3, 3, 3, 2, 2, 1]) → 4"
	
	//int a[]= {1,2,2,3,4,4,5};
	//int a[]= {1, 1, 2, 1, 1};
	//int a[]= {3, 4, 4, 4, 5};
	//int a[]= {8, 8, 6, 6, 5, 5};
	int a[]= {10, 9, 8, 7, 6, 6, 5, 4, 4, 4, 3, 3, 3, 2, 2, 1};
	
	int clumps=0;
	
	for(int i=0;i<a.length-1;i++) {
		
		//if curr and previous are same then increment 
		
		if(a[i]==a[i+1])
		{
			clumps++;
			int j=i+1;  //check next items
			for(; j<a.length-1 ;j++) {
				if(a[j]==a[j+1]) {
				}
				else 
				{
					System.out.println("breaking at index j: "+j);
					break;
				}
			}
			i=j;
		}
			
	}
	
	System.out.println("Clumps: "+clumps);
}
	
}

