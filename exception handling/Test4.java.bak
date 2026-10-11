import java.util.*;

class  Test4
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		int a;
		
		while(true){
			try{
				System.out.print("Fno: ");
				a = scn.nextInt();
				break;
			}
			catch(InputMismatchException e){
				System.out.println("Please enter Integers only");
				scn.nextLine();
			}
		}
		while(true){
			try{
				System.out.print("Sno: ");
				int b = scn.nextInt();
				System.out.println("The division is:"+a/b);
				break;
			}
			catch(InputMismatchException e){
				System.out.println("Please enter Integers only");
				scn.nextLine();
			}
			catch(ArithmeticException e){
				System.out.println("Please Dont enter zero as a divisor");
			}
		}
			
	}
}
