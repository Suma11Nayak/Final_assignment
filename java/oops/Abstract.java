package oops;


		abstract class Abc{
			abstract void m1();
			void m2()
			{
				System.out.println("World");
			}
		}
		public class Abstract extends Abc {
			

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Abstract a1=new Abstract();
				a1.m1();
				a1.m2();
			}

			void m1() {
				System.out.println("Hello");
			}


		

	}

