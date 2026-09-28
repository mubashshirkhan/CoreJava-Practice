class  mainClassLoading
{
	static{
		System.out.println("SB");
		main(new String[0]);//main method executes 2 times
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World! from main");
	}
}
