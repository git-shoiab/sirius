package revision;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr[]= {1,34,67,2,45};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		arr[4]=1000;
		System.out.println(arr[4]);
		
		//System.out.println(arr[5]);
		
		int arr2[]=new int[5];//default value initialized will be zero
		
		System.out.println(arr2[1]);
		
		arr2[2]=4040;
		System.out.println(arr2[2]);
		
		int []arr3=new int[6];
		
		System.out.println(arr2.length);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		//enhanced for loop - new for loop given in jdk5
		System.out.println("....................................");
		for(int i:arr2) {
			System.out.println(i);
		}
	}
}
