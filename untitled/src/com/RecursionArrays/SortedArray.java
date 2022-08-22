package com.RecursionArrays;

public class SortedArray {
    public static void main(String[] args) {

        int arr[] = {9};

        System.out.println(find(arr,0));
    }
    static boolean find(int arr[], int i){

        if( i == arr.length-1){
            return true;
        }

        return arr[i] < arr[i+1] && find(arr,i+1);

    }
}
