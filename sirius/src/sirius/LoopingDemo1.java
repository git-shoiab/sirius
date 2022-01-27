package sirius;

public class LoopingDemo1 {
	public static void main(String[] args) {
		
		//PRE CONDITIONAL CHECK WHILE LOOP
//		while(true) {
//			System.out.println("this is a infinite loop...");
//		}
		
		//POST CONDITIONAL CHECK WHILE LOOP - THIS LOOP WILL RUN ATLEAST ONCE
//		do {
//			System.out.println("This is also a infinite loop....");
//		}while(true);
		
		int i=0;
		while(i<10) {//PRE CHECK
			System.out.println(i);
			i++;
		}
		
		System.out.println("Value of i....:"+i);
		do {
			System.out.println("loop runs...once.");
		}while(i<10);//POST CHECK
		
		//FLOYD TRIANGLE
		int num=99;
		i=0;int j=0;
		while(i<10) {
			j=0;
			while(j<=i) {
				System.out.print(--num+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
