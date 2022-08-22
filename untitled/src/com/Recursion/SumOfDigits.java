package com.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {

        int n = 1342;
        System.out.println(sum(n));
    }
    static int sum(int n){

        if( (n/10 < 1)){
            return n;
        }
        return (n%10) + sum(n/10);
    }
}
