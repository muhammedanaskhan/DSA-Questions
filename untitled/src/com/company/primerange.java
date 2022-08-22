package com.company;

public class primerange {
    public static void main(String[] args) {

        int n = 40;

        for( int i = 2 ; i <= n ; i++ ){
            System.out.println( i + " " + check(i) );
        }
    }
    private static boolean check(int i) {

        int c = 2;
        while (c * c <= i) {
            if( i % c ==0){
                return false;
            }c++;
        }return true;
    }
}
