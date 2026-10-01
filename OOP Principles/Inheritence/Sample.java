/*we can store sub class object ref in super class type ref variable
but we cannont store super clas type object in sub class type ref variable,
it leads to compile time error*/

class Example 
{

}
class Sample extends Example
{  
	Example e1 = new Example();//allowed
	Sample  s1 = new Sample();//allowed
	
	Example e2 = new Sample();//allowed
	Sample  s2 = new Example();//not allowed
} 
