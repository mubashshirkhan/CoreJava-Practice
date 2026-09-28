class AO
{
	static void add(int x,int y){
		int c = x + y;
		System.out.printf("The addition of %d + %d = %d%n",x,y,c);
	}
	static void sub(int x,int y){
		int c = x - y;
		System.out.printf("The substraction of %d  - %d = %d%n",x,y,c);
	}
	static void mul(int x,int y){
		int c = x * y;
		System.out.printf("The multiplication of %d * %d = %d%n",x,y,c);
	}
	static void div(int x,int y){
		int c = x / y;
		System.out.printf("The division of %d / %d = %d%n",x,y,c);
	}
	
}

class  Calc
{
	public static void main(String[] args) 
	{
		AO.add(65,2);
		AO.sub(788,5);
		AO.mul(7,87);
		AO.div(78,2);
	}
}
