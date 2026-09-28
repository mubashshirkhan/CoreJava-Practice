class Test 
{
	static Test t1 = new Test();
	static{
		System.out.println("SB");
	}
	{
		System.out.println("NSB");
	}
	Test(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main");
		Test t2 = new Test();
	}
	static int a = 10;
	int x = 20;
}
