/** Upcasting is casting a subtype to a super type in an upward 
direction to the inheritance tree.
It is an automatic procedure for which there are no efforts 
poured in to do so where a sub-class object is
referred by a superclass reference variable. One can relateit with
dynamic polymorphism.
Implicit casting: means class typecasting done by the compiler without cast syntax
Explicit casting: means class typecasting done by the programmer with cast syntax **/

class Parent
{
	void show(){
		System.out.println("Parent show method is called");	
	}

}

class Child extends Parent
{
	void show(){
		System.out.println("Child show method is called");
	}
}

class OnlyUpcasting 
{
	public static void main(String[] args) 
	{
		Parent p1 = new Child();//a sub-class object is referred by
								//a superclass reference variable
		
		p1.show();
	}
}
