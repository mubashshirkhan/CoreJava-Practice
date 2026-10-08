class A 
{
	static int a = 10;
	
	static{
		System.out.println("class A Sb is excuted");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("A main");
	}
}

class B extends A{
	
	static int b = 20;
	
	static{
		System.out.println("class B SB is excuted");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Bmain");
		System.out.println("a"+a);
		System.out.println("b"+b);
	}
}