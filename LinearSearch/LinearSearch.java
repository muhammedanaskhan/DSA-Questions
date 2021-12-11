package dsa;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		
		int num[] = { 2 , 15 , 58 , 56 , 17 , 12 , 36 , 74  };
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = linearSearch( num , n );
		System.out.println(ans);	
	}
	
	static int linearSearch(int arr[] , int target) {
		
		if( arr.length == 0 ) {
			
			return -1;
			
		}else {
			
			for( int i = 0 ; i < arr.length ; i++ ) {
				if(target == arr[i]) {
					return i;
					
				}
			}
			
		}return -1;
		
	}

}
