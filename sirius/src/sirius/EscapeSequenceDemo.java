package sirius;

public class EscapeSequenceDemo {
	public static void main(String[] args) {
		System.out.println("Hello \"sirius\" world");
		System.out.println("Hello \'sirius\' world");
		
		System.out.println("Hello \f sirius \f world");
		System.out.println("Hello           sirius          world");
		System.out.println("Hello\t\tsirius\t\tworld");
		System.out.println("Hello \bSirius \bWorld");
		
		System.out.println("Hello\nSirius\nWorld");
		System.out.println("Hello\n\tSirius\n\t\tWorld");
		
		System.out.println("Hello Sirius \rWorld");
	}
}
