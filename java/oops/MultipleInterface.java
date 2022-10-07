package oops;

public class MultipleInterface {
	interface inter1{
		void m1();
	}
	interface inter2 {
		void m2();
	}
	interface inter3{
		void m3();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
MultipleInterface M1=new MultipleInterface();
M1.m1();
M1.m2();
M1.m3();
	}
	public void m1(){
		System.out.println("Implementing");
		
	}
    public void m2() {
	System.out.println("Multiple ");
	
}
    public void m3() {
    	System.out.println("Interfaces");

	}

}
