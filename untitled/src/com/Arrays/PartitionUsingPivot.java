package com.Arrays;

import java.util.Arrays;

public class PartitionUsingPivot {
    public static void main(String[] args) {

        int[] arr = {7, 9, 4, 8, 3, 6, 2, 1};
        int pivot = 5;
        partition(arr , pivot);

        System.out.println(Arrays.toString(arr));

    }

    static void partition( int[] ar, int p){

        int i = 0;
        int j = 0;

        while( i < ar.length ) {
            if (ar[i] > p) {
                i++;
            } else if (ar[i] < p) {
                swap(ar, i, j);
                i++;
                j++;
            }
        }
    }
    static void swap(int[] arr , int i , int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
