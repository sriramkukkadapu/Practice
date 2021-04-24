import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CouponsProblem {
public static void main(String args[]) {
	List<String> coupons=new ArrayList<String>();
	coupons.add("A201550B");
	coupons.add("ABB19991000Z");
	coupons.add("ABB19991000Z");
	
	System.out.println(countFakes(coupons));
}
public static int countFakes(List<String> coupons){
	int sum=0;
	
	Iterator itr=coupons.iterator();
	while(itr.hasNext()) {
		String temp=itr.next().toString();
		sum=sum+getCouponValue(temp.toString());
		//System.out.println(temp+" "+sum);
	}
	

	return sum;
}

public static int getCouponValue(String coupon) {
	try {
	int sum=0;
	
	//1st 3 should be characters and capital
	for(int i=0;i<=2;i++) {
		if(!Character.isLetter(coupon.charAt(i))) {
			//System.out.println("Invalid Letters");
			return 0;
		}
		if(!Character.isUpperCase(coupon.charAt(i))) {
			//System.out.println("Invalid Letters");
			return 0;
		}
	}
	
	String yearStr=""+coupon.charAt(3)+coupon.charAt(4)+coupon.charAt(5)+coupon.charAt(6);
	int year=Integer.parseInt(yearStr);
	if(!(year>=1900 && year<=2019)) //invalid year
		{
		System.out.println("Invalid year");
			return 0;
		}
		
	//Get next part of string
	String amountStr="";
	for(int i=7; !(Character.isLetter(coupon.charAt(i))  && Character.isUpperCase(coupon.charAt(i))); i++ )
	{
		amountStr+= coupon.charAt(i);
	}
	int amount=Integer.parseInt(amountStr);
	if(!(amount==10 || amount==20 || amount==50 || amount==100 || amount==200 || amount==500 || amount==1000))
		return 0;
		
	//System.out.println(amountStr);
	
	if(!(Character.isLetter(coupon.charAt(coupon.length()-1)) && Character.isUpperCase(coupon.charAt(coupon.length()-1)) ))
		return 0;
		
	return amount;
	}
	
	catch(Exception e)
	{
		return 0;
	}
}
}
