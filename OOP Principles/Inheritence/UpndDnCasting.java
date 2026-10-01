class A
{
    int x = 10;
}

class B extends A
{
    int y = 20;
}

class C extends B
{
    int z = 30;
}

class Example
{
    void m1(A a)
    {
		System.out.println(a.x);
		
		if(a instanceof C){
			C c1 = (C)a;
			
			System.out.println(c1.y);
			System.out.println(c1.z);
			System.out.println(c1.x);
		}
		else if(a instanceof B){
			B b1 = (B)a;
			
			System.out.println(b1.y);
			System.out.println(b1.x);
		}
    }
}

class UpndDnCasting
{
    public static void main(String[] args)
    {
        Example e1 = new Example();

        e1.m1(new C()); // NO RE
        e1.m1(new B()); // CCE
        e1.m1(new A()); // CCE
    }
} 