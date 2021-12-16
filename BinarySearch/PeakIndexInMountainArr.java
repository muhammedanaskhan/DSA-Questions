package binarySearch;

public class PeakIndexInMountainArr {

	public static void main(String[] args) {
			
			int arr[] = {0 , 2 , 1 , 0};
		
			int start = 0 ; 
	        int end = arr.length -1;
	        boolean found = false;
	        
	        while(start<=end){
	            
	            int mid = (start+end)/2;
	            
	            if( arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1] ){
	                System.out.println(mid);                 // largest element
	                found = true;
	                break;
	                
	            }else if( arr[mid] < arr[mid+1] ){
	                start=mid+1;
	                
	            }else{
	                end=mid-1;
	            }
	           
	        }
	        if(!found) {
	        	System.out.println(-1);
	        }
	        
	        }
	}

