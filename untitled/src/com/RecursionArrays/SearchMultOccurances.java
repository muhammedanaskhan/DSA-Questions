package com.RecursionArrays;

import java.util.ArrayList;

public class SearchMultOccurances {
    public static void main(String[] args) {

        int arr[] = {2, 5, 6, 6, 15 };
        int target = 6;

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(find(arr, target, list , 0));

    }

    static ArrayList<Integer> find(int arr[] , int target, ArrayList<Integer> list, int i){
        if( i== arr.length ){
            return list;
        }
        if( arr[i] == target){
            list.add(i);
           // find(arr, target, list, i++);
        }
        return find(arr, target, list, ++i);
    }
}