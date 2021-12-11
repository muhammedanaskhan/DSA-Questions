package binarySearch;

public class Demonstration {

	public static void main(String[] args) {
		
		int[] arr = { 2 , 7 , 15 , 25 , 36 , 39 , 42 };
		
		int start = 0 ; 
		int end = arr.length -1;
	    boolean found = false;
		
		int target = 37;
		
		while( start <= end ) {
			
			int mid = start + (end - start)/2;
			
			
			if(target < arr[mid]) {
				end = mid - 1 ;
				
			}else if ( target > arr[mid] ) {
				start = mid +1;
			}else {
				System.out.println(mid);
				found = true;
				break;
			}
			
		}if(!found) {
			System.out.println("not found");
		}
		
	}

}
