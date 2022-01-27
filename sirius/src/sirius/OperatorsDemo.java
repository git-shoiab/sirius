package sirius;
//SECOND EXERCISE
public class OperatorsDemo {
	public static void main(String[] args) {
		//1. Arithmetic operators  2. Logical operators  3. Relational Operators
		
		int n1=10;
		int n2=3;
		
		//Addition
		int add=n1+n2;
		System.out.println("Addition..:"+add);
		
		//Substraction
		int sub=n1-n2;
		System.out.println("Substraction...:"+sub);
		
		//Multiply
		int mul=n1*n2;
		System.out.println("Multiplication..:"+mul);
		
		//Division
		int div=n1/n2;//division will give you the quotient
		System.out.println("Division..quotient.:"+div);
		
		//Mod
		int mod=n1%n2; //mod will give you the reminder
		System.out.println("Mod-Reminder..:"+mod);
		
		//INCREMENT AND DECREMENT
		
		int num=10;
		
		System.out.println(num++);//this is called post increment - it prints first and then it increments....10
		System.out.println(num);//11
		
		num=10;
		System.out.println(++num);//this is called pre increment - it increments first and then prints - 11
		System.out.println(num);//11
		
		num=10;
		System.out.println(num--);//10
		System.out.println(num);//9
		
		num=10;
		System.out.println(--num);//9
		System.out.println(num);//9
		
		//INCREMENT AND DECREMENT BY A VALUE MORE THAN ONE
		
		num=10;
		//num=num+5;
		num+=5;
		System.out.println(num);
		num=10;
		//num=num-15;
		num-=15;
		System.out.println(num);
		num=10;
		//num=num*4;
		num*=4;
		System.out.println(num);
		num=10;
		//num=num/3;
		num/=5;
		System.out.println(num);
		num=10;
		//num=num+5;
		num%=3;
		System.out.println(num);
		
		
		
	}
}
