
public class StringLiterals {
public static void main(String args[]) {
	String s="abc"; //96354
	String s2="abc"; //96354
	s= "def"; //99333
	System.out.println(s.hashCode());  //def
	System.out.println(s2.hashCode()); //abc
	
	String s3= new String("abc");
	String s4= new String("abc");
	
//	System.out.println(s3.hashCode());
//	System.out.println(s4.hashCode());

	System.gc();
      
      System.out.println("abc"=="abc"); // reference is same   => true
      String s5=new String("abc");
      String s6=new String("abc");
      System.out.println(s5==s6);  // reference is different    => false
      System.out.println(s5.equals(s6)); // content is same   => true
}
}
