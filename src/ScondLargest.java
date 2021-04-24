
public class ScondLargest {
public static void main(String args[]) {
	int a[]= {2,4,1,9,6,89,65,93,53,101,99};
	int big=a[0], temp=-65387;
	for(int i=0;i<a.length;i++) {
		if(a[i]>big)
		{	
			if(a[i]>temp && a[i]>big) {
					temp=big;
					big=a[i];
			}
		}
		else {
			if(temp<a[i])
				temp=a[i];
		}
		
		System.out.println("temp: "+temp+" big: "+big);	
	}
	
	System.out.println(big);
	System.out.println(temp);
	
}
}
