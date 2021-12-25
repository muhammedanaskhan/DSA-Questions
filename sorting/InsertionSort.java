 package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int arr[]= { 4 ,5 , 3 , 1 , 2 };
		
		for( int i = 0 ; i < arr.length-1 ; i++  ) {
			for( int j = i+1 ; j > 0 ; j-- ) {
				
				if( arr[j] < arr[j-1] ) {
					swap(arr , j , j-1);
					System.out.println(Arrays.toString(arr));
				}else {
					System.out.println(Arrays.toString(arr));
					break;
				}
				
			}
		}System.out.println(Arrays.toString(arr));
		
	}
	
	static void swap(int arr[] , int j , int k) {
		int temp = arr[j];
		arr[j]  = arr[k];
		arr[k] = temp;
	}

}
