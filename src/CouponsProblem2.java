import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CouponsProblem2 {
public static void main(String args[]) {
	List<String> coupons=new ArrayList<String>();
//	coupons.add("A201550B");
//	coupons.add("ABB19991000Z");
//	coupons.add("ABB19991000Z");
	Scanner sc=new Scanner(System.in);
	int count=sc.nextInt();
	
	for(int i=1;i<=count;i++)
	{
		String s=sc.next();
		coupons.add(s);
	}
	
	System.out.println(countFakes(coupons));
}
public static int countFakes(List<String> coupons){
	int sum=0;
	
	Iterator itr=coupons.iterator();
	while(itr.hasNext()) {
		String coupon=itr.next().toString();
		//System.out.println(temp+" "+sum);
		
		try {
			
			//1st 3 should be characters and capital
			for(int i=0;i<=2;i++) {
				if(!Character.isLetter(coupon.charAt(i))) {
					//System.out.println("Invalid Letters");
					continue;
				}
				if(!Character.isUpperCase(coupon.charAt(i))) {
					//System.out.println("Invalid Letters");
					continue;
				}
			}
			
			String yearStr=""+coupon.charAt(3)+coupon.charAt(4)+coupon.charAt(5)+coupon.charAt(6);
			int year=Integer.parseInt(yearStr);
			if(!(year>=1900 && year<=2019)) //invalid year
				{
				//System.out.println("Invalid year");
				continue;
				}
				
			//Get next part of string
			String amountStr="";
			for(int i=7; !(Character.isLetter(coupon.charAt(i))  && Character.isUpperCase(coupon.charAt(i))); i++ )
			{
				amountStr+= coupon.charAt(i);
			}
			int amount=Integer.parseInt(amountStr);
			if(!(amount==10 || amount==20 || amount==50 || amount==100 || amount==200 || amount==500 || amount==1000))
				continue;
				
			//System.out.println(amountStr);
			
			if(!(Character.isLetter(coupon.charAt(coupon.length()-1)) && Character.isUpperCase(coupon.charAt(coupon.length()-1)) ))
				continue;

				sum=sum+amount;
			}
			
			catch(Exception e)
			{
				continue;
			}
	}
	

	return sum;
}


}
