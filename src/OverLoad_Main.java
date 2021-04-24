
public class OverLoad_Main {
public static void main(String args[]) {
	OverLoad_Main o=new OverLoad_Main();
			o.main("Test");
			
			main(5);
}
public void main(String s) {
	System.out.println("Inside new main method: "+s);
}
public static void main(int a) {
	System.out.println("Inside new static main method: "+a);
}
}
