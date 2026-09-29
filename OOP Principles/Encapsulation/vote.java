
import java.util.Scanner;

class vote 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		Voter v1 = new Voter();
		
		while(true){
			try{
				System.out.print("\nEnter your age: ");
				v1.setVote(scn.nextInt());
				
				System.out.println("Collect voter card from eseva after 30 days");
				
			}
			catch(IllegalArgumentException e){
				System.out.println("Erroe: "+e.getMessage());
			}
		}
	}
}
