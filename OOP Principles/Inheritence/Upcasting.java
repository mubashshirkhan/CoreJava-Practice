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

class Upcasting
{
	public static void main(String[] args) 
	{
		A a = new C();
		
		a.m1();
		//a.m2();
		//a.m3();
		
		C c = (C)a;//downcasting
		
		c.m1();
		c.m2();
		c.m3();
	}
}
