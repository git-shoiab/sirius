package revision;

public class VariableDemo {
	public static void main(String[] args) {
		//Number types
		//decimal types
		//char type
		//boolean type
		//special type - string
		//simple type and complex type
		
		//what we need to learn
		/*
		 * 1. the different types
		 * 2. declaration
		 * 3. valid identifiers
		 * 4. initialization
		 * 5. complex types
		 */
		//Number types
		//byte,short,int,long
		//Declaration
		byte b;//variable by name b of type byte is declared
		//when we declare the name for the variable, we need to ensure that we follow valid names
		
		byte weight;//valid
		byte _weight;//valid
		byte $weight;//valid
		byte we2ght;//valid
		byte we_gh2t5$_;//valid
		
		//and also we ensure the variable names, package names, method names start with lower case letter
		
		//byte 2weight;//invalid - cannot start with a number but can end with a number
		//byte we#ght;//invalid - no special characters except _ and $ can be used
		//byte class;//invalid - java keywords cannot be used to declare variables
		//byte we ght;//invalid - space cannot be used..
		
		//INITIALIZATION
		//Range of value which could be given to byte - 8 bit
				// -128 to 127
				b=127;
				b=-128;
				
				//short - 16 bit -32768 to 32767
				short s=32767;//max value
				s=-32768;//min value
				
				//int - 32 bit - -2147483648 to 2147483647
				
				int i=-2_1474_836_48;//underscore for readability
				i=21_474_83647;
				
				//long - 64 bit -9223372036854775808
				
				long l=9223_372036854775807L;
				l=-92233720368_54775808L;

				//float-32 bit and double 64 bit
				float f=100;
				f=100.24f;
				
				double d=233.4554;
				
				//character - 16 bit - 0 to 65535
				char c=97;//97 is ASCII representation of 'a' (American standard code for information interchange)
				c='a';
				
				//boolean - it accepts only true or false
				boolean studying=true;
						studying=false;
						
						//no size limit for string and string is a complex type
				String str="hello world...";// this will create one object in memory
				System.out.println(str.charAt(0));
				System.out.println(str.indexOf('h'));
				System.out.println(str.substring(5));
				System.out.println(str.subSequence(5, 8));
				
				//various ways of string creation
				str=new String("hello..............");//in this case two objects are created in memory
				str=String.valueOf("helllllllllllllllllllloooooooooooooooooooooooooo");
	
				//all primitive types also have their corresponding complex types
				//WRAPPER CLASSES
				//byte - Byte, short - Short, int - Integer, long - Long, char-Character, float - Float
				//double - Double, boolean - Boolean
				
				Integer n=20;
				Integer nn=new Integer(20);
				Integer nnn=Integer.valueOf(20);
				
				System.out.println(Integer.MIN_VALUE);
				System.out.println(Integer.MAX_VALUE);
				System.out.println(Integer.min(10, 20));
				System.out.println(Integer.max(10, 20));
				
				String num1="100";
				String num2="200";
				
				System.out.println(num1+num2);
				
				System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));//parseInt method will convert string to int
				
				String s1="hello world....";
				String s2=new String("hello world....");
				
				System.out.println(s1==s2);//== is comparison in java - this will compare two object address
				System.out.println(s1.hashCode()+":"+s2.hashCode());
				System.out.println(s1.equals(s2));// this will compare two has codes
				
				String c1="a";//ascii-97
				String c2="c";//ascii-98
				
				System.out.println(c1.compareTo(c2));//uses ASCII value and gives a + or - or 0 values in return - we use this facility in sorting algorithms
				
	}
}
