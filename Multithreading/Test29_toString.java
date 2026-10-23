
/**
 * @Override
 * public String toString()
 * 	- Inside Thread class toString() method is overridden 
 *    to print thread object's state information in the pattern
 *    	Thread[#id, name, priority, groupname] 
 * 
 */
public class Test29_toString {
	public static void main(String[] args) {
		
		Thread th1 = new Thread();
		
		System.out.println(th1); //th1.toString() -> overridden -> STATE is printed
		//Thread[#35,Thread-0,5,main]
		
		Thread th2 = new Thread("Child-2");
		System.out.println(th2);//Thread[#36,Child-2,5,main]

					
		Thread th3 = Thread.currentThread();
		System.out.println(th3);//Thread[#3,main,5,main]

		
		th3.setPriority(7);
		
		Thread th4 = new Thread();
		System.out.println(th4);//Thread[#37,Thread-1,7,main]

/**/		
	}
}