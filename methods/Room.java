class  Room
{
	private int l;
	private int b;
	
	public Room(int l, int b){
		this.l = l;
		this.b = b;
	}
	public void setL(int l){
		this.l = l;
	}
	public int getL(int l){
		return l;
	}
	public void setb(int b){
		this.b = b;
	}
	public int getb(){
		return b;
	}
	public void findArea(){
		System.out.println("Area: "+(l*b));
	}
	public void findPerimeter(){
		System.out.println("Perimeter: "+(2*(l+b)));
	}
	public void display(){
		System.out.println("l :"+l);
		System.out.println("b: "+b);
	}
}
