class A
{
	void m1(){
		System.out.println("A m1");
	}
}
class B extends A
{
	
	void m2(){
		System.out.println("B m2");
	}
}
class C extends B
{
	void m3(){
		System.out.println("C m3");
	}
}


class UpandDowncast
{
	public static void main(String[]args){
		
		A a = new B();//upcasted cuz by ref var a object of B cls is created
		B b = new C();//checks if C is subclass of B typecast it then
		C c = new C();//No casting
		
		//using a ref
		a.m1();
		//a.m2();
		//a.m3();
		
		
		//using b ref
		b.m1();
		b.m2();
		//b.m3();
		
		//using b ref
		c.m1();
		c.m2();
		c.m3();
		
		
		
	}
}