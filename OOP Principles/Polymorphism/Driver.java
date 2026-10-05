abstract class Vehicle
{
	abstract void start();
	abstract void stop();
}
class Car extends Vehicle{
	
	
	@Override
	void start(){
		System.out.println("Car is started");
	}
	
	@Override
	void stop(){
		System.out.println("Car is stopped");
	}
}

class Bike extends Vehicle{
	
	
	@Override
	void start(){
		System.out.println("Bike is started");
	}
	
	@Override
	void stop(){
		System.out.println("Bike is stopped");
	}
}
class Bus extends Vehicle{
	
	
	@Override
	void start(){
		System.out.println("Bus is started");
	}
	
	@Override
	void stop(){
		System.out.println("Bus is stopped");
	}
}

class Function
{
	void run(Vehicle v){
		v.start();
	    v.stop();

	}
}



class Driver
{
	public static void main(String[] args) 
	{
		Function f1 = new Function();
		
		f1.run(new Car());
		f1.run(new Bike());
		f1.run(new Bus());
	}
}
