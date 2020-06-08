


 class SingleTonClass {
	
	//public object of this class
	 public static SingleTonClass obj=null;
	 
	 //make private constructor
	 private SingleTonClass()
	 {
		 System.out.println("inside constructor");
	 }
	 
	 //getInstance method to get object of SingleTonClass
	 public static SingleTonClass getInstance() {
		 if(obj==null)
			 obj=new SingleTonClass();
		 return obj;
	 }
	 
	 public void print()
	 {
		 System.out.println("Inside SingleTon Class object");
	 }
	 
}

public class SingleTonExample
{
	public static void main(String args[])
	{
		  //No need to Create object to SingleTonClass, Just call getInstance
		SingleTonClass soc=SingleTonClass.getInstance(); // here construcotr also gets called
		soc.print();
	}
}
