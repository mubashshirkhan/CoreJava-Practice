public class Test04_String_objects_2ways {
	public static void main(String[] args) {
		
		String s1 = "hari";						//1 object, pooling is applied
		String s2 = new String("krishna");		//2 objects, pooling is not applied

		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		String s3 = "HK";	//1					//SCPA
		String s4 = "HK";	//0
		
		String s5 = new String("NiT");	//2		//HA
		String s6 = new String("NiT");	//1

		System.out.println(s3 == s4);			//reference -> true
		System.out.println(s3.equals(s4));		//state		-> true
		System.out.println();
		
		System.out.println(s5 == s6);			//reference	-> false
		System.out.println(s5.equals(s6));		//state		-> true		
	}
}