class  NullException
{
	static int a = 10;
	static int b = 20;
	
	int x = 30;
	int y = 40;
	 
	public static void main(String[] args) 
	{
		NullException e1 = new NullException();
		NullException e2 = new NullException();
		NullException e3 = null;
		
		//System.out.println(null);  
		System.out.println((String)null);
		System.out.println(e1.a); System.out.println(e1.x);
		System.out.println(e2.a); System.out.println(e2.x);
		System.out.println(e3.a); System.out.println(e3.x);
	}
}
