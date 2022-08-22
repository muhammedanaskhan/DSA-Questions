package com.RecursionArrays;

public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = {2, 8 , 5 , 13, 10};
        int num=50;

        System.out.println(search(arr, num , 0));
    }
    static boolean search(int arr[], int num, int i ){
        if(i == arr.length){
            return false;
        }
        return arr[i] == num || search(arr, num , i+1);
    }

}