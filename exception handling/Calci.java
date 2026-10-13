class NegativeNumberException extends Exception
{
	NegativeNumberException(){
		super();
	}
	NegativeNumberException(String errMsg){
		super(errMsg);
	}
}
class Addition
{
	static int add(int a, int b)throws NegativeNumberException{
		if(b<=0 || a<=0){
			throw new NegativeNumberException("Do ot pass -ve number or zero");
		}
		int res = a + b;
		return res;
	}
}

class Calci 
{
	public static void main(String[] args) 
	{	
		java.util.Scanner scn = new java.util.Scanner(System.in);
		try{
			System.out.print("Enter Fno: ");
			int a = scn.nextInt();
			
			System.out.print("Enter Sno: ");
			int b = scn.nextInt();
			
			int res = Addition.add(10,20);
			System.out.println("Result: "+res);
		}
		catch(java.util.InputMismatchException e){
			System.out.println("Error: pass only integers");
		}
		catch(NegativeNumberException e){
			System.out.println("Error: "+e.getMessage());
		}
	}
}
