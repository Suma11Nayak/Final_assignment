package oops;



public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y,z;
		OverLoading s1=new OverLoading();
		s1.operation(20.23,10.23);
		s1.operation(15, 10);
		s1.operation(15.0,7.0);
	}
      void operation(double x, double y) {
		double sub=x-y;
		System.out.println("Subtraction of given numbers " +sub);
		// TODO Auto-generated method stub
		
	}
	void operation(int x,int y)
	{
		int sum=x+y;
		System.out.println("Sum of given numbers " + sum);
	}
	
	
	void operation(float x,float y)
	{
		float sub=x-y;
		System.out.println("Subtraction of given numbers " + sub);
	}
	

	

	}


