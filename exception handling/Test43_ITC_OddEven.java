/**
 * Develop a multi-thread program to print 
 * 		even numbers from one thread and 
 *      odd numbers from other thread
 * in the given range 1-20
 * 
 * we must get result as sequence numbers
 * 	1 2 3 4 5 6 7 8 9 19 11 12 13 14 15 16 17 18 19 20
 * 	
 */

//PrintNumbers.java
class PrintEvenOddNumbers {
	private boolean oddPrinted;
	
	synchronized void printOddNumbers(int num) {
		if(oddPrinted) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.print(num + " ");
		
		oddPrinted = true;
		notify();
	}
	
	synchronized void printEvenNumbers(int num) {
		
		if(!oddPrinted) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.print(num + " ");
		
		oddPrinted = false;
		notify();
	}
	
}

class OddPrinterThread extends Thread {
	private PrintEvenOddNumbers obj;
	
	public OddPrinterThread(PrintEvenOddNumbers obj) {
		this.obj  = obj;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=20; i=i+2) {
			obj.printOddNumbers(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class EvenPrinterThread extends Thread {
	private PrintEvenOddNumbers obj;
	
	public EvenPrinterThread(PrintEvenOddNumbers obj) {
		this.obj  = obj;
	}
	
	@Override
	public void run() {
		for(int i=2; i<=20; i=i+2) {
			obj.printEvenNumbers(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Test43_ITC_OddEven {
	public static void main(String[] args) {
		
		PrintEvenOddNumbers evenOddNumbers = new PrintEvenOddNumbers();
		
		OddPrinterThread oddPrinterThread = new OddPrinterThread(evenOddNumbers);
		EvenPrinterThread evenPrinterThread = new EvenPrinterThread(evenOddNumbers);
		
		oddPrinterThread.start();
		evenPrinterThread.start();
		
	}
}