package sirius;

public class ArrayDemo2 {
	public static void main(String[] args) {
		//DOUBLE DIMENSIONAL ARRAY
		
		//int twod[][]
		int [][]twod= {
				{34,45,56,78},
				{13,78,42,89}
		};
		
		System.out.println("No of rows...:"+twod.length);
		System.out.println("No of columns..:"+twod[0].length);
		
		System.out.println(twod[0][2]);
		
		int twodd[][]=new int[3][4];
		
		twod[1][2]=9999;
		
		twod[1][3]=8888;
		
		System.out.println(twod[1][2]);
		
		//UNEVEN MULTI DIMENSIONAL ARRAY
		
		int twodue[][]=new int[3][];
		//Can you please repeat this un even multidimensional array once - I did not understood the column part
		twodue[0]=new int[2];
		twodue[1]=new int[4];
		twodue[2]=new int[1];
				
	}
}
