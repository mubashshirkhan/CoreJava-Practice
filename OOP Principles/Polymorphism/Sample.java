class Example
{
	static void m1(){
		System.out.println("Example m1");
	}
	void m2(){
		System.out.println("Example m2");
	}
	void m3(){
		System.out.println("Example m3");
	}
	void m4(){
		System.out.println("Example m4(no-param)");
	}
}
class Sample extends Example{
	
		static void m1(){
			System.out.println("Sample m1");
		}
		void m2(){
			System.out.println("Sample m2");
		}
		void m4(String s){
			System.out.println("Sample m3 (int param)");
		}
		public static void main(String[] args) 
		{
			Sample s1 = new Sample();
			s1.m1();
			s1.m2();
			s1.m3();
			s1.m4();
			s1.m4("HK");
			System.out.println("\n ============================ \n");
			Example e1 = new Sample();
			e1.m1();
			e1.m2();
			e1.m3();
			e1.m4();
			//e1.m4("HK");
			
		}
		
}
