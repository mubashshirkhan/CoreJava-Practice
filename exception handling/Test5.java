class Test4 {
	public static void main(String[] args) {

		System.out.println("Before try");

		try{
			System.out.println("In try");

		} catch(ArithmeticException e){
			System.out.println("In catch");

		} finally{
			System.out.println("In finally");

		}

		System.out.println("After try/catch/finally");
		System.out.println();
     //================================================================================
		System.out.println("Before try");

		try{
			System.out.println("In try");

		} finally{
			System.out.println("In finally");
		}

		System.out.println("After try/finally");

	}
}