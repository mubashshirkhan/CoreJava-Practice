class A  
{
	static int a = 10;
		   int x = 20;
}
class B extends A
{
    static int a = 30;//varibale hiding
		   int x = 40;//varibale hiding
	
	void m1(){
		System.out.println("a: "+a);
		System.out.println("a: "+x);
		
		System.out.println("a: "+super.a);
		System.out.println("a: "+super.x);
	}
}
class Superinjava{
public static void main(){
	B b = new B();
	b.m1();
}
}
