/*
 * 
 * SB -> mini DB
 * 	1. C	-> append(end) and insert(begin or middle)
 * 	2. R	-> retrieve
 * 	3. U	-> modify/replace/set
 * 	4. D	-> delete/remove
 * ==============================================================================
 * 1. public StringBuilder append(xxx data)
 * 2. public StringBuilder insert(int index, xxx data)
 * 
 * 3. public StringBuilder charAt(int index)
 * 
 * 4. public StringBuilder setCharAt(int index, char newChar)
 * 5. public StringBuilder replace(int start, int end, String chars)
 * 
 * 6. public StringBuilder deleteCharAt(int index)
 * 7. public StringBuilder delete(int begin, int end)
 * ==============================================================================
 * 
 * 8. public StringBuidler reverse() 
 * ==============================================================================
 * 
 * 9. public int length()
 * 10. public int capacity()
 * 
 * 11. public void ensureCapacity(int minCap)
 * 12. public void trimToSize()
 * 13S. public void setLength(int length)
 * ==============================================================================
 * 	
 */
public class Test10_SB_methods {
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1: "+ sb1 + "\t\t\t\t\t\t" + sb1.length());
		
	//==================== Create (append) at end ===========================================	
		sb1.append("Hari ");
		System.out.println("sb1: "+ sb1 + "\t\t\t\t\t" + sb1.length());
		
		sb1.append("NiT ");
		System.out.println("sb1: "+ sb1 + "\t\t\t\t\t" + sb1.length());
				
		sb1.append(7279);
		System.out.println("sb1: "+ sb1 + "\t\t\t\t" + sb1.length());
		
	//==================== Create (insert) @begin or middle or end===========================================	
		sb1.insert(0, "Java ");
		System.out.println("sb1: "+ sb1 + "\t\t\t\t" + sb1.length());
		
		sb1.insert(10, "Krishna ");
		System.out.println("sb1: "+ sb1 + "\t\t\t" + sb1.length());
		
		sb1.insert(sb1.length(), " Ameerpet");
		System.out.println("sb1: "+ sb1 + "\t" + sb1.length());
		System.out.println();
				
	//==================== Retrieve ===========================================	
		System.out.println(sb1.charAt(0));
		System.out.println(sb1.charAt(12));
		System.out.println(sb1.charAt(20));
//		System.out.println(sb1.charAt(40));
//		System.out.println(sb1.charAt(-1));
		System.out.println();
		for(int i=0; i<sb1.length(); i++) {
			System.out.print(sb1.charAt(i));
		}
		System.out.println();
	//==================== replace ===========================================
		sb1 = new StringBuilder();
		System.out.println(sb1);

		sb1.append("abc bbc cbc dbc");
		System.out.println(sb1);
		
		sb1.setCharAt(1, 'y');
		System.out.println(sb1);
		
		sb1.replace(4, 11, "hyderabad");
		System.out.println(sb1);
		
		sb1.replace(4, 7, "secundrabad");
		System.out.println(sb1);
		
		sb1.replace(4, 7, "J");
		System.out.println(sb1);
		System.out.println();

	//==================== delete ===========================================
		sb1 = new StringBuilder();
		sb1.append("abc bbc cbc dbc");
		System.out.println(sb1);

		sb1.deleteCharAt(1);
		System.out.println(sb1);
			
		//sb1.delete(3, 5);
		sb1.delete(3, 6);
		System.out.println(sb1);
		
	//====================== delete text dynamically =======================================
	//================== delete last occurrence of ,space =======================================
	
		sb1 = new StringBuilder();
		sb1.append("abc, bbc, cbc, dbc, ");

		int start = sb1.lastIndexOf(", ");
		int end   = start + 2;
		
		sb1.delete(start, end);
		System.out.println(sb1);
		System.out.println();
		
	//=================== reverse chars in the below string =======================================================	
		sb1 = new StringBuilder();
		sb1.append("How Are You?");
		
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		System.out.println();
	//==========================================================================	
		sb1 = new StringBuilder();
		System.out.println(sb1.capacity()); //number of locations of char[] in SB
		System.out.println(sb1.length());	//number of characters  stored in SB
		System.out.println();
		
		sb1.append("Hari");
		
		System.out.println(sb1.capacity()); //number of locations of char[] in SB
		System.out.println(sb1.length());	//number of characters  stored in SB
		System.out.println();
		
		sb1.append("NiT Ammerpet Hyderbad");
		
		System.out.println(sb1.capacity()); //number of locations of char[] in SB
		System.out.println(sb1.length());	//number of characters  stored in SB
		System.out.println();
		
		sb1 = new StringBuilder(0); //[]
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("a"); //CC * 2 		=> 0 * 2 		=> 0 (wrong formula)
						 //(CC * 2) + 2 => (0 * 2) + 2 	=> 2 (correct formula)	
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		/*
		//SB capacity increasing formula 
				//=> (CC * 2) + 2 -> nc
				//=> nc < nl => nc=nl
		
		
		System.out.println();
	//==========================================================================
		sb1 = new StringBuilder(3);
		System.out.println(sb1.capacity()); //3
		System.out.println(sb1.length());	//0
		
		sb1.append("Hari Krishna");		
									//nc= (3*2)+2=>8
									//nc(8) < nl(12) 
									//nc => nl(12)
		
		System.out.println(sb1.capacity()); //18(wrong) -> 12 (correct)
		System.out.println(sb1.length());	//12
		System.out.println();
		
	//==========================================================================
		sb1 = new StringBuilder(3);
		sb1.append("Hari");
							//nc => (cc(3)*2) + 2 = 8
							//nc(8) < nl(4) -> no
							//nc=8
		
		System.out.println(sb1.capacity()); //8
		System.out.println(sb1.length());	//4
		
		sb1.ensureCapacity(10);  //not exactly, it is not less than 10
				//if(ec>cc){
						//fc => (cc * 2) + 2 = 18
						//if(fc > ec) 18>10
						//	nc = fc  (18)
						//else
						//	nc = ec 
				//}
		
		System.out.println(sb1.capacity()); //18 (how)
		
		sb1.ensureCapacity(40);
		System.out.println(sb1.capacity()); //40
		
		sb1.ensureCapacity(20);
		System.out.println(sb1.capacity());

		sb1.ensureCapacity(-1);
		System.out.println(sb1.capacity());
		
		sb1.ensureCapacity(100);
		System.out.println(sb1.capacity());
		
	//===============================================
		sb1 = new StringBuilder(100);
		sb1.append("Hari");
		
		sb1.trimToSize();
		
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
	//===============================================
		sb1 = new StringBuilder(100);
		sb1.append("Hari Krishna");
		System.out.println(sb1);
		
		sb1.setLength(4);
		
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println(sb1);
/**/		
	}
}