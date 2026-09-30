class  A
{
	static int a = 10;
	
	static {
		System.out.println("IN A SB");
		System.out.println("a:"+a);
		System.out.println("b:"+b);  //error
		System.out.println("b:"+B.b);
		System.out.println("b:"+B.getB());
	}
}

class B extends A
{
    static int b = 20;

    static {
        System.out.println("IN B SB");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("b:" + getB());
    }

    static int getB() {
        return b;
    }

    public static void main(String[] args) {
        System.out.println("IN B MAIN");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}