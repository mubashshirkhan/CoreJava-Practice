class Thread22 extends Thread
{
	public void run(){
		for(int i=1;i<=10;i++){
						
			try{
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
				
			}catch(InterruptedException e){
				
				System.out.print("");
			}
		}
	}
}
class Test
{
	public static void main(String[] args) 
	{
		Thread22 t1 = new Thread22();
		
		
		try{
			t1.join();
		}catch(InterruptedException e){
				
				System.out.print("");
		}
		t1.start();
		for(int i=1;i<=10;i++){
			try{
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
				
			}catch(InterruptedException e){
				
				System.out.print("");
			}
		}
	}
}
