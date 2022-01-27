package sirius;

public class ArraysDemo {
	public static void main(String[] args) {
		//	ARRAY
		
		int i=10;
		
		int arr[]= {10,34,56,78,56};//this is a single dimensional array  - one row and 5 columns
		
		System.out.println(arr[0]);//First Value
		System.out.println(arr[4]);//last value
		
		System.out.println("The length of array - No of columns...:"+arr.length);
		System.out.println(arr[arr.length-1]);
		
		int arr2[]=new int[5];//only declartion, but still array values will be initialized to zero
		arr2[0]=999;//Assigning a value to array
		arr2[1]=888;
		System.out.println(arr2[1]);		
	}
}
