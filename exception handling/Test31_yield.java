

/**
- Pausing Currently Running Thread (CRT) 
  by using yield() method
  
  	public static void yield()

*/
class MyThread23 extends Thread {
	@Override
	public void run() {
		System.out.println("run is executed");
	}
}

public class Test31_yield {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread23 mt1 = new MyThread23();
		mt1.start();

		Thread.yield(); //Requesting Thread Scheduler to pause this CRT main thread 
						//and allowing other thread to execute
		
						//This request many or may not be accepted
						//by thread scheduler
		
		System.out.println("main end");
	}
}