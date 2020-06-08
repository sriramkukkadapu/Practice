
public class SummationInArray {
public static void main(String args[])
{
	int a[]= {1,2,3,4,5,6};
	int target=4;
	int currentSum;
	System.out.println("Given Target: "+target);
	for(int i=0;i<a.length;i++)
	{
		for(int j=i;j<a.length;j++)
		{
			int sum=0;
			for(int k=i;k<=j;k++)
			{
				sum=sum+a[k];
				if(sum==target)
				{
					print(a,i,j);
					System.out.println(" => "+target);
					System.out.println("");
				}
			}
			//System.out.println("Sum calculated: "+sum);
			
		}
		System.out.println("======");
		System.out.println("1 End to End iteration done");
	}
}

public static void print(int a[],int start, int end)
{
	for(int i=start;i<=end;i++)
		System.out.print(i+" ");
}
}
