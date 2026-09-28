class Example
{
	int x;	
	int y;
	
	Example(){
		x = 8;
		y = 10;
	}
	Example(int x, int y){
		this.x = x;
		this.y = y;
	}
	Example(Example e){
		this.x = e.x;//cureent object value e2 assigned to new object value e3
		this.y = e.y;
	}
	public void display(){
		System.out.println(x + " " + y);
	}
}

class  TestingCopyConstructor
{
	public static void main(String[] args) 
	{
		Example e1 = new Example();//we added default constructor cuz we cant call 
		//copy constructor without sending object as paremeter and for creating object we need
		//default or param constructor
		e1.display();
		
		Example e2 = new Example(15,16);
		e2.display();
		
		System.out.println();
		e2.x = 45;
		e2.y = 55;
		
		Example e3 = new Example(e2); //creating object by calling copy constructor
		//with previous e2 object
		e2.display(); //this is new object e3 dta is asme as
		e3.display();//e2 object data copied in this object
		System.out.println(e2 == e3);//data is same memory is diifrent
		System.out.println();
		
		Example e4 = e2; //copying e2 object ref into e4
		e2.display(); //both e4 and e2 pointing to same memory
		e4.display(); //here new object is not created
		System.out.println(e2 == e4);// "true",  cuz we have only copied the refrence 
		//of e2 i e4
		
	}
}
