interface Shape
{
	abstract void findArea();
	abstract void findPerimeter();
}
class Rectangle implements Shape{
	
	private double l;
	private double b;
	
	Rectangle(double l,double b){
		this.l = l;	
		this.b = b;
	}
	
	@Override
	public void findArea(){
		System.out.println("Area of Rectangle is: "+(l*b));
	}
	
	@Override
	public void findPerimeter(){
		System.out.println("Perimeter of Rectangle is: "+ (2*(l*b)));
	}
}

class Square implements Shape{
	
	private double s;
	
	Square(double s){
		this.s = s;	
		
	}
	
	@Override
	public void findArea(){
		System.out.println("Area of Square is: "+(s*s));
	}
	
	@Override
	public void findPerimeter(){
		System.out.println("Perimeter of Square is: "+ (4*s));
	}
}

class Circle implements Shape{
	
	private static final float PI = 3.14f;
	private double r;
	
	
	Circle(double r){
		this.r = r;	
		
	}
	
	@Override
	public void findArea(){
		System.out.println("Area of Circle is: "+(PI*r*r));
	}
	
	@Override
	public void findPerimeter(){
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

class Test02
{
	public static void main(String[]args){
		
		Painter p1 = new Painter();
		
		p1.draw(new Rectangle(10,5));
        p1.draw(new Square(5));
        p1.draw(new Circle(5));		
	}
}