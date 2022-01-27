package sirius;
//SEVENT EXERCISE
import java.util.Scanner;

public class ConditionDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number..:");
		int num=scan.nextInt();
		
		boolean result=num%2==0;
		
		String value=result?"Even Number...":"Odd Number...";//if result is true then the first string will be allocated or else the next
		
		System.out.println(value);
	}
}	
