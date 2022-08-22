package com.RecursionArrays;

import java.util.Arrays;

public class QuiclSort {
    public static void main(String[] args) {

        int[] arr = {7, 9, 4, 8, 3, 6, 2, 1};

        quicksort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));

    }
    static void quicksort( int[] arr, int low, int high){

        if( low > high){
            return;
        }
        int pivot = arr[high];
        int pi = partition(arr, pivot, low, high);

        quicksort(arr, low, pi -1);
        quicksort(arr, pi+1, high);

    }

    static int partition( int[] ar, int p, int low, int high){
        System.out.println("pivot -> " + p);
        int i = low;
        int j = low;

        while( i <= high ) {
            if (ar[i] > p) {
                i++;
            } else if (ar[i] <= p) {
                swap(ar, i, j);
                i++;
                j++;
            }
        }

        return (j-1);
    }
    static void swap(int[] arr , int i , int j){

        System.out.println("swapping" + arr[i] + "and" + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
