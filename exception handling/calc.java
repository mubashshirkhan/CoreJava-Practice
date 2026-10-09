//Develop a program to add only +ve nums,if -ve passed throw exception

class  Addition
{
	static int add(int a,int b){
		
		if(a<0 || b<0){
			throw new IllegalArgumentException("Do no pass -ve values");
		}
		
		int c = a + b;
		return c;
	}
}

class calc{

public static void main(String[]args){
	
	int r1 = Addition.add(10,2); System.out.println(r1);
    int r2 = Addition.add(10,-2);System.out.println(r2);

 }
} 