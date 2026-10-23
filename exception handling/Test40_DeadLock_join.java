class Thread7 extends Thread {
	private Thread8 th8;
	
	public void setThread8(Thread8 th8) {
		this.th8 = th8;
	}
	
	@Override
	public void run() {
		String name = getName();
		System.out.println(name + " start");
		System.out.println(name + " before calling th8.join()");
		try {
			th8.join();
		}catch(InterruptedException e) { }
		
		System.out.println(name + " end");
	}
}

class Thread8 extends Thread {

	private Thread7 th7;
	
	public void setThread7(Thread7 th7) {
		this.th7 = th7;
	}
	
	@Override
	public void run() {
		String name = getName();
		System.out.println(name + " start");
		System.out.println(name + " before calling th7.join()");
	
		try {
			th7.join();			//leads to deadlock
			//th7.join(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " end");
	}
}

public class Test40_DeadLock_join {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread7 th7 = new Thread7();
		Thread8 th8 = new Thread8();
		
		th7.setName("th7");
		th8.setName("th8");
		
		th7.setThread8(th8);
		th8.setThread7(th7);

		th7.start();
		th8.start();

		System.out.println("main end");
	}
}