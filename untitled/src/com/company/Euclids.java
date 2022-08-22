package com.company;

public class Euclids {
    public static void main(String[] args) {
        System.out.println(gcd(10,20));
    }
    public static int gcd(int a, int b){

        if(a==0){
            return b;
        }

        return gcd(b%a,a);

    }

}
