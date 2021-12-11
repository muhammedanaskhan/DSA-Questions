package binarySearch;

public class FloorOfNumInArray {

	public static void main(String[] args) {
		
		int[] arr = { 2 , 6 , 8 , 11 , 15 , 20 , 23 };
		
		int target = 12;
		
		System.out.println(FindFloor(arr,target));
	}
	
	static int FindFloor( int[] ar , int target) {
			
			int start = 0;
			int end = ar.length - 1 ;
			
			
			while(start <= end) {
				
				int mid = (start + end) / 2;
			
				if( target < ar[mid] ) {
					end = mid -1;
				}else if( target > ar[mid] ) {
					start = mid +1;
				}else {
					return ar[mid];
				}
				
			}return ar[end];
			
		}

}
