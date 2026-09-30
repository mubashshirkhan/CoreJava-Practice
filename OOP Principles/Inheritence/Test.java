class A
{
	static int a = 10;
	static{
		System.out.println("HI");
	}
}
class B extends A
{
	static int b = 20;
	
	static{
		System.out.println("Hello");
	}
}


class Test
{
	public static void main(String[] args) 
	{
		System.out.println(B.b);
		//very imp prgram if we replace a => b then see output
		System.out.println(B.a);
		System.out.println();
	}
}
 