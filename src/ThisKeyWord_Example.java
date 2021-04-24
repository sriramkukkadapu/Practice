class Math1{
	int a=5;
	int b=6;
	
	Math1(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public void print(){
		System.out.println(a);
		System.out.println(b);
	}
}

public class ThisKeyWord_Example {
	public static void main(String args[]) {
		Math1 m=new Math1(3,4);
		m.print();
	}
}


