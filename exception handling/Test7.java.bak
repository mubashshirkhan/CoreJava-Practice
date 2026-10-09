/*
24. finally with return statement
	- inside finally if we place transfer statement 'return'
	  we will have below three problems
	  	1. after try/catch/finally we can not place any statement
			it leads to CE: unreachable statement
		2. The value returned either from try or from catch
		   will not be returned to calling method. Always 
		   the finally returned value will be returned.
		3. The uncaught exception is not propagated to calling method
		   it is suppressed by the value returned from finally.

Q) How can we supress an exception throwing from a method without catching?
	- place 'return statement' in finally block

	- In a void method
		place return; 

	- In a non-void method
		place return value; 
*/
class  Test7 {
	public static void main(String[] args) {
		System.out.println(m1());
		m2();
	}

	static int m1() {

		System.out.println("Before try");
		
		try{
			System.out.println("In try");
			//return 10;
			//return 10/0;
			Integer.parseInt("a");
			
		} catch(ArithmeticException e){
			System.out.println("In catch");
			return 20;

		} finally{
			System.out.println("In finally");
			return 30;
		
		}

		//System.out.println("After try/catch/finally"); //CE: u r s		
		//return 50;
	}

	static void m2() {
		try{
			System.out.println("In try");
			System.out.println(10/0);
			
		} finally{
			System.out.println("In finally");
			return;	
		}
	}
}