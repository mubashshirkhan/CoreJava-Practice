class A 
{
	static int m1(){
		System.out.println("A SV");
		return 10;
	}
	static{
		System.out.println("A SB");
	}
	static int a = m1();
	
	public static void main(String[] args) 
	{
		System.out.println("A MM");
	}
}

class B extends A
{
	static int b = m2();
	
	static int m2(){
		System.out.println("B SV");
		return 20;
	}
	static{
		System.out.println("B SB");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("B MM");
	}
	
}
