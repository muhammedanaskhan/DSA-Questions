package com.RecursionArrays;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {5, 4 , 3, 2, 1};
        arr = mergesort( arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergesort(int[] arr){

        if( arr.length == 1 ){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr,0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge( left, right);
    }

    private static int[] merge(int[] left, int[] right) {

        int i = 0;
        int j =0 ;
        int k =0;

        int[] mix = new int[left.length+ right.length];

        while( i < left.length && j < right.length){

            if( left[i] > right [j]){
                mix[k] = right[j];
                j++;
                k++;
            }
            else if( left[i] < right [j]){
                mix[k] = left[i];
                i++;
                k++;
            }

        }

        while(i< left.length){
            mix[k] = left[i];
            i++;
            k++;
        }

        while(j< right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;

    }
}
