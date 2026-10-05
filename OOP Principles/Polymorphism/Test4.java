class A
{
	final void m1(){
		System.out.println("A m1");
	}
}
class B extends A
{
	void m1(){
		System.out.println("B m1");
	}
}
class Test4 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.m1(); 
	}
}
