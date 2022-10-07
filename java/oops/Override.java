package oops;



	class Method1{
		 

		void Overriding() {
			System.out.println("Method1");
		}
		
	}
public class Override extends Method1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Override m1=new Override();
         m1.Overriding();
        
	}
	void Overriding() {
		super.Overriding();
	  System.out.println("Method2 overrides the Method1");
	  }

	}


