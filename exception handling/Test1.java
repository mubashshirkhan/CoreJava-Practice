//develop a program to get two integer inputs using scanner class,
//devide the numbers amd print result. Handle exceptions if any came

import java.util.Scanner;
import java.util.InputMismatchException;

class Test1
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		while(true){
		try{
			System.out.print("Please enter teh first number: ");
			int a = scn.nextInt();
			System.out.print("Please enter teh Second number: ");
			int b = scn.nextInt();
			System.out.println("The division is: "+(a/b));
			break; 
		}
		catch(ArithmeticException e){
			System.out.println("Please dont pass zero as a second value" );
			
		}
		catch(InputMismatchException e){
			System.out.println("Please pass only integer values ");
			scn.nextLine();
	  }
	}
   }
}
