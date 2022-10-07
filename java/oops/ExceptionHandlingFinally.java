package oops;

public class ExceptionHandlingFinally {

	public static void main(String[] args) {
		try {
			int x=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println("value of e is "+e );
			}
		finally {
			System.out.println("Always executed");
		}

	}

	
		// TODO Auto-generated method stub

	}

