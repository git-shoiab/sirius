package sirius;

import java.util.Scanner;

public class IODemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number...:");
		int num1=scan.nextInt();//INPUT
		
		System.out.println("Please enter another number...:");
		int num2=scan.nextInt();
		
		int sum=num1+num2;//PROCESS
		
		System.out.println("The addition or sum of num1 and num2 is..:"+sum);//OUTPUT
	}
}
