package dsa;

public class MaxIn2DArray {

	public static void main(String[] args) {
		
		int [][] arr = {
				{ 4, 54, 89 },
				{54, 47 , 108},
				{ 105, 46, 103, 201, 99, 100 }
		};
		
		int num = max(arr);
		
		System.out.println(num);
	}
	
	static int max(int [][] a) {
		
		int max = Integer.MIN_VALUE;
		
		for( int r = 0 ; r < a.length ; r++ ) {
			for( int c = 0 ; c < a[r].length ; c++ ) {
			
				if( a[r][c] > max ) {
					max = a[r][c];
				}
				
			}
		}return max;
	}

}
