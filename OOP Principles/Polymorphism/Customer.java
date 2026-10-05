abstract class Shape
{
	abstract void findArea();
	abstract void findPerimeter();
}
class Rectangle extends Shape{
	
	private double l;
	private double b;
	
	Rectangle(double l,double b){
		this.l = l;	
		this.b = b;
	}
	
	@Override
	void findArea(){
		System.out.println("Area of Rectangle is: "+(l*b));
	}
	
	@Override
	void findPerimeter(){
		System.out.println("Perimeter of Rectangle is: "+ (2*(l*b)));
	}
}

class Square extends Shape{
	
	private double s;
	
	Square(double s){
		this.s = s;	
		
	}
	
	@Override
	void findArea(){
		System.out.println("Area of Square is: "+(s*s));
	}
	
	@Override
	void findPerimeter(){
		System.out.println("Perimeter of Square is: "+ (4*s));
	}
}

class Circle extends Shape{
	
	private static final float PI = 3.14f;
	private double r;
	
	
	Circle(double r){
		this.r = r;	
		
	}
	
	@Override
	void findArea(){
		System.out.println("Area of Circle is: "+(PI*r*r));
	}
	
	@Override
	void findPerimeter(){
		System.out.println("Perimeter of Circle is: "+ (2 * PI *r));
	}
}

class Painter
{
	void draw(Shape s){
		s.findArea();
	    s.findPerimeter();

	}
}

class Customer
{
	public static void main(String[]args){
		
		Painter p1 = new Painter();
		
		p1.draw(new Rectangle(10,5));
		
	}
}