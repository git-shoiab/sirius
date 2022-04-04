package revision;

public class OperatorsDemo {
	public static void main(String[] args) {
		//arithmetic operatiors
		//+, -, *, /, % (Mod)
		
		System.out.println(11%2);//reminder
		
		int i=10;
		//i=i+1;
		//i++;//post increment
		//++i;//pre increment
		System.out.println(i++);//prints the value first and then increments
		System.out.println(i);
		System.out.println(++i);//increment first and then prints
		
		//i-- and --i
		
		//i=i+2;
		i+=4;
		System.out.println(i);
		
		//Relational operators
		System.out.println(10<12 && 12>14);
		System.out.println(10<12 || 12>14);
	}
}
