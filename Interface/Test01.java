interface Animal
{
	void eat();
	void sound();
}

class Dog implements Animal
{	
	@Override
	public void eat(){
		System.out.println("Dog is eating");	
	}
	
	@Override
	public void sound(){
		System.out.println("Dog is barking");	
	}
}
class Cat implements Animal
{	
	@Override
	public void eat(){
		System.out.println("Cat is eating");	
	}
	
	@Override
	public void sound(){
		System.out.println("Cat is mewing");	
	}
}
class Cow implements Animal
{	
	@Override
	public void eat(){
		System.out.println("Cow is eating");	
	}
	
	@Override
	public void sound(){
		System.out.println("Cow is humbing");	
	}
}
class AnimalTrainer
{
	void train(Animal a){
		a.eat();
		a.sound();
	}
}

class Test01 
{
	public static void main(String[] args) 
	{	
		AnimalTrainer a = new AnimalTrainer();
		
		a.train(new Dog());
		System.out.println("=============");
		a.train(new Cat());
		System.out.println("=============");
		a.train(new Cow());
	}
}
