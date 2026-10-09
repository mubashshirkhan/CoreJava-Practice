/*
23. finally execution test cases
	- However control comes out of the try block,
	  the finally block statements are always executed 

	- finally block execution has 5 cases
	  	1. normal flow
				- in try, in finally, after t/c/f			-> NT
		2. with exception and caught
				- in try, in catch, in finally, after t/c/f -> NT
		3. with exception and not caught
				- in try, in finally, excep message			-> ANT
		4. with transfer statement 'return' 
				- in try, in finaly, try return value		-> ANT
		5. with System.exit(0);
				- in try									-> ANT
*/
class  Test13 {
	public static void main(String[] args) {
		System.out.println("From main result: "+ m1());
	}
	static int m1() {
		System.out.println("Before try");
		//System.out.println(10/0);
		
		try{
			System.out.println("In try");				
			//System.out.println(10/0);
			//System.out.println(Integer.parseInt("a"));
			return 10;
			//System.exit(0);			
		} catch(ArithmeticException e) {
			System.out.println("In catch");
			
		} finally{
			System.out.println("In finally");
			//if uncaught exception happened in try block then the 
			//exception show after finally execution
		}
		System.out.println("After try/catch/finally");
		return 20;
	}
}