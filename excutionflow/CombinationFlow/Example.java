class Example{
	
	static Example e1 = new Example();
	static{
		System.out.println("SB starts");
		Example e2 = new Example();
		System.out.println("SB ends");
	}
	Example(){
		System.out.println("NPC starts");
		Example e3 = new Example(5);
		System.out.println("NPC ends");
	}
	Example(int x){
		System.out.println("IPC executed");
	}
	static int a = m1();
	static int m1(){
		System.out.println("SV a is intitialized");
		return 10;
	}
	static{
		System.out.println("SB2 is executed");
	}
	{
		System.out.println("NSB is executed");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Example e3 = new Example();
		m3();
		e3.m4();
		System.out.println("Main end");
	}
	static void m3(){
		System.out.println("m3 starts");
		Example e5 = new Example();
		System.out.println("m3 end");
	}
	void m4(){
		System.out.println("m4 starts");
		Example e6 = new Example();
		System.out.println("m4 ends");
	}
}
