package oops;


public class Interface {

	
		interface interface1{
			void m1();
			int x=99;//final variable
		}

		public class InterfaceExample implements interface1{

			public void main(String[] args) {
				// TODO Auto-generated method stub
				InterfaceExample E1=new InterfaceExample();
				E1.m1();

			}
		public void m1()
		{
			System.out.println("hello");
			System.out.println(x);
		}
		}


	}


