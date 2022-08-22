package com.Recursion;

public class CountZeroes {
    public static void main(String[] args) {

        int n = 2020;
        int count =0;
        System.out.println(zero(n,count));

    }
    static int zero(int n, int count){

        if(n < 10){
            if(n==0){
                return count+1;
            }else{
                return count;
            }
        }

        if(n%10 == 0){
            return zero(n/10,count+1);
        }else{
            return zero(n/10,count);
        }
    }
}
