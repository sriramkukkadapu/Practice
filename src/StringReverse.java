
public class StringReverse {
public static void main(String args[]) {
	StringBuilder s=new StringBuilder("testing");
	String s2="";
	
	for(int i=s.length()-1;i>=0;i--) {
		s2=s2+s.charAt(i);
	}
	System.out.println(s2);
	
	
	for(int i=0,j=s.length()-1;  i<=s.length()/2;    i++, j--) {
		
		char l=s.charAt(i);
		char r=s.charAt(j);
		
		s.setCharAt(i, r);
		s.setCharAt(j, l);
	}
	
	System.out.println(s);
}
}
