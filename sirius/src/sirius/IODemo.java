package sirius;

import java.util.Scanner;

public class IODemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number...");
		int num=scan.nextInt();
		
		System.out.println("The Number you entered is...:"+num);
		
		boolean result=num%2==0;
		if(result) {
			System.out.println("Even Number....");
		}
		else {
			System.out.println("Odd Number.....");
		}
	}
}
