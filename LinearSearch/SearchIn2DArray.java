package dsa;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		
		int[][] arr = {
				{2, 4, 6},
				{18, 36, 85, 56},
				{78, 25, 78, 30, 11},
				{18, 12}
		};
		
		int target = 85;
		int[] ans = search(arr, target);
		System.out.println(Arrays.toString(ans));
		
	}
	
	static int[] search(int[][] a, int t) {
		
		for( int i = 0 ; i < a.length ; i++ ) {
			for(int j = 0 ; j < a[i].length; j++) {
				if(a[i][j] == t) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1, -1};
		
		
	}

}
