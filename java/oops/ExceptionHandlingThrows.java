package oops;



class Class1{
	void method1(){
		System.out.println("Hello");
		
	}
	
}
public class ExceptionHandlingThrows extends Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandlingThrows t1=new ExceptionHandlingThrows();
		try 
		{
			t1.method1();
		}
		catch(ArithmeticException e) {
			System.out.println("Catch Code");
		}
			System.out.println("Rest of the code" );
	}

	}


