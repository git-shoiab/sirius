package sirius;
//NINTH EXERCISE
public class ConditionDemo3 {
	public static void main(String[] args) {
		int day=4;
		
		switch(day) {
		default:{
			System.out.println("default get called...");
			break;
		}
			case 1:{
				System.out.println("its monday....");
				break;
			}
			case 2:{
				System.out.println("its tuesday...");
				break;
			}
			case 3:{
				System.out.println("wednesday...");
				break;
			}
			
		}
		
		char c='a';
		
		switch(c) {
		case 'a':{
			System.out.println("a for apple..");
			break;
		}
		case 'b':{
			System.out.println("b for ball..");
			break;
		}
		default:{
			
		}
		}
		
		String str="hello";
		
		switch(str) {
		case "hello":{
			System.out.println("its hello......");
		}
		}
	}
}
