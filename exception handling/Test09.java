class Test09 {
	public static void main(String[] args) {

		try{
			System.out.println(10 / 0);

		}catch(Exception e) {
			e.printStackTrace();

			System.out.println("=============");
			System.out.println(e.toString());

			System.out.println("=============");
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println(10 / 0);
	}
}