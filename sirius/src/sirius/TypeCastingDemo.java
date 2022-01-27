package sirius;

public class TypeCastingDemo {
	public static void main(String[] args) {
		long l=100;//64 bit
		
		int i=(int)l;//32 bit // type casting - converting 64 bit long to 32 bit int
		
		int n=100;
		
		long nl=n;//automatic type promotion
		
		//when a higher data type is given to a lower type then explicit type casting has to be done
		//when a lower data type is given to a higher data type then auto type promotion will happen
		
		byte b1=10;
		
		byte b2=2;
		
		byte b3=(byte)(b1*b2);//when an arithmetic operation is performed the result in java will always be int
		
		int num=258;
		
		byte bnum=(byte)num;//only upto 127 can be stored in byte
		
		System.out.println(bnum);
		
		//when a down casting happens, the data will loose its precision
		
		char c=97;
		int cn=c;
		
		//by default character is a number
		//but all numbers cannot be character
		
		//c=cn;//is invalid - you cannot store number in a character because all numbers cannot be character
		c=(char)cn;
			
	}
}
