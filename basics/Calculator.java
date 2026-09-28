import java.util.Scanner;

class Calculator
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
		
		while (true)
		{
		  System.out.print("\nEnter first number (or -1 to exit): ");
		  int x = scn.nextInt();

    if (x == -1)
    {
        break;
    }

    System.out.print("Enter second number: ");
    int y = scn.nextInt();

    System.out.print("Choose operation (+, -, *, /, %): ");
    String operand = scn.next();

    if (operand.equals("+"))
        System.out.println("Result: " + (x + y));
    else if (operand.equals("-"))
        System.out.println("Result: " + (x - y));
    else if (operand.equals("*"))
        System.out.println("Result: " + (x * y));
    else if (operand.equals("/"))
        System.out.println("Result: " + (x / y));
    else if (operand.equals("%"))
        System.out.println("Result: " + (x % y));
    else
        System.out.println("Invalid operation!");
}
    }
}