class Factory {
	
	private int items;
	private boolean itemsAvailable;
	
	public synchronized void produce(int items) { //task #1: modifying
		
		if(itemsAvailable) {
			try {
				wait(); //1. pauses CRT- producer and 
						//2. unlock the current object factory
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
		this.items = this.items + items;
		System.out.println("Items produced: "+ items);
		itemsAvailable = true;
		
		notify(); //notifies to other waiting thread 'Consumer'
				  //about this current object factory
				  //saying it is about to unlock
		
	}
	
	public synchronized void consume(int items) { //task #2: reading
		
		if(!itemsAvailable) {
			try {
				wait(); //pauses CRT - Consumer
						//and unlock the current object factory	
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.items = this.items - items;
		System.out.println("items consumed: " + items);
		itemsAvailable = false;
		
		notify();//notifies to other waiting thread 'Producer'
		  		//about this current object factory
		  		//saying it is about to unlock
	}
	
}

class ProducerThread extends Thread {
	
	private Factory factory;

	public ProducerThread(Factory factory) {
		this.factory = factory;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			factory.produce(i);
		}
	}
	
}

class ConsumerThread extends Thread {
	
	private Factory factory;

	public ConsumerThread(Factory factory) {
		this.factory = factory;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			factory.consume(i);
		}
	}
	
}

public class Test42_ITC {
	public static void main(String[] args) {
		
		Factory factory = new Factory();
		
		ProducerThread pt = new ProducerThread(factory);
		ConsumerThread ct = new ConsumerThread(factory);
		
		pt.start();
		ct.start();
		
	}
}


