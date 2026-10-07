 class Test{
	
	public static void main(String[]args){
		
	try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a / b;
		System.out.println("Division is: "+c);
	   
	}catch(ArrayIndexOutOfBoundsException e){
		
		System.out.println("Please pass two integers as follows: ");
		System.out.println(">java test08 10 20");
	}
	catch(NumberFormatException e){
		System.out.println("Please pass only Integer values");
	}
	catch(ArithmeticException e){
		System.out.println("Please dont pass '0' as second value");
	
    }
  }
}