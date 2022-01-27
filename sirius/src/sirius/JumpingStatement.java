package sirius;

public class JumpingStatement {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue;//CONTINUE THE CALLING LOOP AND NOT CONTINUE DOWN OR FURTHER
			}
			else {
				System.out.println(i);
			}
		}
	}
}
