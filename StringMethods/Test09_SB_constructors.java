/*
 * 1. public `StringBuilder()
 * 2. public `StringBuilder(int capacity)
 * 3. public `StringBuilder(String s)
 * 4. public `StringBuilder(CharSequence sb)
 * 
 */
public class Test09_SB_constructors {
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1: "+ sb1);
		System.out.println("sb1: "+ sb1.length());
		System.out.println("sb1: "+ sb1.capacity());
		System.out.println();
		
		StringBuilder sb2 = new StringBuilder(5);  //50-50
		System.out.println("sb2: "+ sb2);
		System.out.println("sb2: "+ sb2.length());
		System.out.println("sb2: "+ sb2.capacity());
		System.out.println();	
		
		StringBuilder sb3 = new StringBuilder("Hari");
		System.out.println("sb3: "+ sb3);
		System.out.println("sb3: "+ sb3.length());
		System.out.println("sb3: "+ sb3.capacity());
		System.out.println(); 
		
		StringBuilder sb4 = new StringBuilder(sb3);
		System.out.println("sb4: "+ sb4);
		System.out.println("sb4: "+ sb4.length());
		System.out.println("sb4: "+ sb4.capacity());
		System.out.println();
		
		sb3.append("NiT");
		System.out.println("sb3: "+ sb3);
		System.out.println("sb4: "+ sb4);
		

//		StringBuilder sb5 = new StringBuilder(null); //no CE, String param is matched
													 //RE: NPE
		
//		sb4.append(null); //CE: a e
		sb4.append((String)null); //no CE, no RE
		
		System.out.println("sb4: "+ sb4);
		System.out.println("sb4: "+ sb4.length());
		System.out.println("sb4: "+ sb4.capacity());
		System.out.println();
		
//		String	str = new String(null); 		   //CE: a e
//		String	str = new String((String)null);  //CE: no CE, RE: NPE
		String str = new String();
//		str.concat(null);
		
/**/		
	}
}