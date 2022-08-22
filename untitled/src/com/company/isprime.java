package com.company;
// find prime numbers between 0-n
public class isprime {

    public static void main(String[] args) {

        int n = 12;

        System.out.println(check(n));
    }

    private static boolean check(int n) {
        int i = 2;
        while (  i * i <= n){
            if( n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }


}
