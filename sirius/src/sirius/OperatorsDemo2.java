package sirius;
//THIRD EXERCISE
public class OperatorsDemo2 {
	public static void main(String[] args) {
		//RELATIONAL OPERATORS
		
		int num=10;
		int num2=12;
		
		System.out.println("Comparison...:"+(num==num2));//Equal
		
		System.out.println("Comparison...:"+(num!=num2));//Not Equal
		
		System.out.println("Lesser than...:"+(num<num2));
		System.out.println("Greater than...:"+(num>num2));
		
		System.out.println("Lesser than equal to...:"+(num<=num2));
		System.out.println("Greater than equal to...:"+(num>=num2));
		
		//LOGICAL OPERATORS - & AND |  - AND / OR
		
		System.out.println((num>num2)&&(num%2==0));//since one condition is failing the result will be false - AND
		
		System.out.println((num>num2)||(num%2==0));//though one condition is failing the result will be true - OR
		
	}
}
