public class Test03_RelationBW_String_SB_SB {
	
	public static void main(String[] args) {
		
		String 			s1	= "Hari";
	//	StringBuffer 	sb1 = "Hari";   //CE: i c t: String cannot be converted to SBuffer
	//	StringBuilder 	sb2 = "Hari";   //CE: i c t: String cannot be converted to SBuilder
		
	//=======================================================================		
		String 			s3	= "Hari1";
		StringBuffer	sb3 = new StringBuffer("Hari2"); //constructor copies data
		StringBuilder	sb4 = new StringBuilder("Hari3");//constructor copies data
    //=======================================================================		
		CharSequence cs1 = s3;
		CharSequence cs2 = sb3;
		CharSequence cs3 = sb4;
		
	//=======================================================================		
		m1(s3);
		m1(sb3);
		m1(sb4);
	}
	
	static void m1(CharSequence cs) {
		System.out.println(cs);
	}
}