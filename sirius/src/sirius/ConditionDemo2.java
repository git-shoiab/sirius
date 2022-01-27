package sirius;

public class ConditionDemo2 {
	public static void main(String[] args) {
		int day=4;
		
		System.out.println(day==2);
		boolean valid=(day==2);
		if(day==1) {
			System.out.println("its monday....");
		}
		else if(day==2) {
			System.out.println("its tuesday....");
		}
		else if(day==3) {
			System.out.println("its wednesday....");
		}
		else {
			System.out.println("no idea what day...");
		}
	}
}
