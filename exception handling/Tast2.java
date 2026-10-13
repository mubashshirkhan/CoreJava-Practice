//problems in Test1.java program if we enter first value correctly and
//entered second value wrong then it will ask every time enter two values

//redevelop above program to ask user to enter only
//the present value which is given wrong out not first value
import java.util.*;

class Tast2 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		int a;
		int b;

		while(true){
		try{
			System.out.print("Enter Fno: ");
			a = scn.nextInt();
			break;
		}
		catch(InputMismatchException e){
			System.out.println("Please pass only integer values");
			scn.nextLine();

	    }
	   
	  }
		while(true){
		try{
			System.out.print("Enter Sno: ");
			b = scn.nextInt();
			System.out.println("Division is: "+a/b);
			break;
		}
		catch(ArithmeticException e){
			System.out.println("Please dont pass zero as a second value");	
		}
		catch(InputMismatchException e){
			System.out.println("Please pass only integer values");
			scn.nextLine();
	    }
	   
	  }
   }
}
