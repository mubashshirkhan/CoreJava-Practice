/**dev a program to store floating point
numbers as a group and print them**/

class DataType 
{

		float [] ia ={10.3f,6.5f,9.0f,3.2f};
		/**System.out.println(ia[0]);
		System.out.println(ia[1]);
		System.out.println(ia[2]);
		System.out.println(ia[3]);**/
		
        for (int i = 0; i < ia.length; i++) {
            System.out.printf("The value for index %d is %.1f%n", i, ia[i]);
        }
		
		for(float value :ia){
			System.out.println(value);
		}
		
		System.out.println(java.util.Arrays.toString(ia));


}
