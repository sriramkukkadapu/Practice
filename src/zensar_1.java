import java.util.Scanner;

public class zensar_1 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	String s=n+"";
	int size=s.length();
	int a[]=new int[size];
	int temp=n;
	
	for(int i=0;i<size;i++)
	{
		a[i]= Integer.parseInt( s.charAt(i)+"");
	}
	
	a=swap(a,1,3);
	a=swap(a,2,4);
	a=swap(a,1,4);

	
	for(int i=0;i<size;i++) {
		a[i]= ((a[i]-7) %10);
	}
	
	for(int i=0;i<size;i++) {
		if(a[i]<0)
			System.out.print(-a[i]);
		else
			System.out.print(a[i]);
	}
	
}

public static int[] swap(int a[],int l,int r) {
	
	l=l-1;
	r=r-1;
	int temp=a[l];
	a[l]=a[r];
	a[r]=temp;
	
	return a;
}
}








