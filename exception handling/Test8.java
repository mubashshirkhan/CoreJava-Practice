//redevelop above program so the usage of throw keyword for throwing an exeption
//throws keyword for reporting and exception try catch for catching the thrown exception and printing error msg

import java.util.Scanner;

class Addition
{
	static int add(int a , int b)throws IllegalArgumentException{
		
		if(a < 0 || b < 0){
			throw new IllegalArgumentException("Do not pass -ve numbers");	
		}
		int c = a + 10;
		return c;
	}	
	
}


class  Test8
{
	public static void main(String[] args) 
	{
		Scanner scn =  new Scanner(System.in);
		while(true){
			try{
			System.out.print("Enter Fno: ");
			int a = scn.nextInt();
			
			System.out.print("Enter Sno: ");
			int b = scn.nextInt();
			
			int c = Addition.add(a,b);
			System.out.println("Result: "+c);
			break;
			}
		
		catch(IllegalArgumentException e){
			System.out.println("Error:"+e.getMessage());
		  }
		}
		System.out.println("main ends");
	}
	
}
