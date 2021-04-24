
class StaticClass{
	int a=5;
	int b=6;
	static int c;
}

public class StaticExample {
	public static void main(String args[]) {
			StaticClass s=new StaticClass();
			StaticClass s2=new StaticClass();
			
			System.out.println(s.a);
			System.out.println(s.b);
			
			System.out.println(StaticClass.c);
			
			s2.c=10;
			System.out.println(StaticClass.c);
			System.out.println(s.c);
			
	}
}
