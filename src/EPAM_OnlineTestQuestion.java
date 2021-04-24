
public class EPAM_OnlineTestQuestion {
public static void main(String args[]) {
//in a given array ignore elements in between occurence of 6 and 9 , rest all sum and print that
//	Compilation successful.
//
//	Example test:   [1, 3, 5] - 9
//	OK
//
//	Example test:   [4, 5, 6, 15, 12, 9, 3]  - 12
//	OK
//
//	Example test:   [2, 1, 6, 9, 11] - 14
//	OK
//
//	Example test:   [2, 1, 6, 9, 11, 6, 19, 12, 9, 2] - 16
//	OK

	class Solution {
	    public int solution(int[] a) {
	        // write your code in Java SE 8
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
	if(a[i]==6)
	{

	int found_9=0,j=i+1,temp_sum=0;
	  for(;j<a.length;j++)
	{
	temp_sum=temp_sum+a[j];
	if(a[j]==9){
	found_9=1;
	break;
	}
	}
	if(found_9==0)
	sum=sum+temp_sum;

	if(found_9==1) //we should ignore elements from 6 to 9
	i=j;
	}

	else{
	sum=sum+a[i];
	}
	}

	return sum;
	    }
	}

}
}
