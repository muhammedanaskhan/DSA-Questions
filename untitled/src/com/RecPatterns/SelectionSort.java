package com.RecPatterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int arr[] = {4, 3, 1 , 2, 5 };
        sort(arr, 0, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int arr[], int i, int j, int min, int begin ){

        if(begin==j){
            return;
        }

        if(i<j){
            if(arr[min] > arr[i+1] ){
                sort(arr, ++i, j, arr[i+1], begin);
            }else{
                sort(arr, ++i, j, ++i, begin);
            }
        }else{
            swap(arr, min, begin );
            sort(arr, begin, j, arr[begin], begin);
        }
    }
    static void swap(int arr[], int min, int begin){
        int temp = arr[min];
        arr[min] = arr[begin];
        arr[begin] = temp;
    }
}
