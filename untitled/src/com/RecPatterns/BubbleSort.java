package com.RecPatterns;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = {4, 3, 2, 5, 1};
        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int arr[], int j, int i){

        if(j==0){
            return ;
        }
        if( i < j ) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
            sort(arr, j, ++i);
        }else{
            sort(arr, --j, 0);
        }

    }

    static void swap (int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}