package sirius;

public class VariableDemo {
	public static void main(String[] args) {
		/*
		 * 1. Number - 
		 * 		byte - 8 bit
		 * 		short - 16 bit
		 * 		int - 32 bit
		 * 		long - 64 bit
		 * 2. Floating Numbers
		 * 		float - 32 bit
		 * 		double - 64
		 * 3. Character
		 * 		char - 32 bit - 0 to 65535
		 * 4. boolean - 1 
		 * 5. String - unlimited
		 */
		
		//VALID IDENTIFIER
		//1. Data Types should be declared with a valid identifier
		
		int age;//valid identifier
		int _age;//valid identifier
		int $age;//valid identifier
		int a2ge;//valid identifier
		int _a$_2_g4e;//valid identifier
		
		//INVALID	
		
		//int 2age; cannot start with a number
		//int &age; cannot start with a special character other than _ and $
		//int float; cannot have a java keyword as a variable name
		
		//int a g e; cannot have space in between
		
		//INITIALIZATION
		
		byte b=127; //valid
		b=-128; //valid
		//byte bbb=128;//invlaid - data cannot exceed the 8 bit 127 and -128
		
		short s=-32768;//valid
		s=32767;//valid
		//s=32768;//invalid - out of range
		
		int i=-21_474_83_648;//valid
		i=2147483647;//valid
		//i=2147483649;//in valid - out of range
		
		float f=100;//valid
		//f=100.2;//invalid
		f=100.2f;//valid- only with suffix f the variable value of float will be considered as float or else it will considered as double
		
		double d=434.455;
		
		char c='a';
		c=97;
		
		boolean boo=true;
		boolean boo2=true;
		
		String str="hello world";
		String str2="hello world";
		
		//= is assignment operator
		//== is comparison operator - will always return a boolean
		
		System.out.println(100==100);
		System.out.println(100.24==100.24);
		System.out.println('a'=='a');
		System.out.println(boo==boo2);
		
		System.out.println(str.equals(str2));
		
		//ABOVE ARE PRIMITIVE TYPES EXCEPT STRING
		//COMPLEX TYPES - 	WRAPPER CLASSES
		Integer ii=20;
		Float ff=20.2f;
		Short ss=200;
		Byte bb=100;
		Boolean booo=true;
		Long ll=Long.valueOf(100);
		Character cc='a';
				
	}
	
	
	
}
