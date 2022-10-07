package AccessModifier;



public class StaticAccessModifier {


		String Name;
		int	id;
		int	sal;
		String job;

	public static void main(String[] args) {
		StaticAccessModifier e1=new StaticAccessModifier();
		e1.init("suma",123,100000,"Manager");
		e1.display();
		StaticAccessModifier e2=new StaticAccessModifier();
		e2.init("John",133,45000,"Tester");
		e2.display();
	}
	  private void init(String Name_temp, int id_temp, int sal_temp, String job_temp) {
		// TODO Auto-generated method stub
		  Name=Name_temp;
		  id=id_temp;
		  sal=sal_temp;
		  job=job_temp;
		
	}
	void display() {
	    	System.out.println("Emp Name: " +Name);
	    	System.out.println("Emp id: " +id);
	    	
	    	System.out.println("Emp sal: " +sal);
	    	System.out.println("Emp Designation: " +job);
		// TODO Auto-generated method stub

	}
		// TODO Auto-generated method stub

	}


