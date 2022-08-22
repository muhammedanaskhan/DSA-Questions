package com.Recursion;

public class ProductofDigits {
    public static void main(String[] args) {

        int n = 56;
        System.out.println(product(n));
    }
    static int product(int n){

        if( (n/10 < 1)){
            return n;

        }
        return (n%10) * product(n/10);
    }

}
