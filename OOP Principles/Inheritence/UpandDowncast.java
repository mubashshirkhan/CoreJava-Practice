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
class  Test
{
	public static void main(String[] args) 
	{
		m3(new A());
		m3(new B());
	}
	static void m3(A a1){
		a1.m1();
		//a1.m2(); error variable a1 of type A, so it cant acces B members
		
		//B b1 =(B)a1; //java.lang.ClassCastException: class A cannot be cast to class B.
		//b1.m2();
		
		if(a1 instanceof B){
			B b1 = (B) a1;
			b1.m2();
		}
	}
}


