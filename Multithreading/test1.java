class Test1 extends Thread
{
	@Override
	public void run(){
		System.out.println("run executed");
	}
	public static void main(String[]args){
		
		System.out.println("Main start");
		
		Test1 th1 = new Test1();
		th1.start();
		System.out.println("Main ends");
	}
}