package com.Recursion;

public class ReerseANum {
    public static void main(String[] args) {

        int n =51458;

        int digits = (int)(Math.log10(n)) + 1;
        System.out.println(rev(n, digits));
    }

    static int rev(int n, int d){

        if(n/10 <1){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10,d-1) + rev(n/10, d-1);

    }
}
