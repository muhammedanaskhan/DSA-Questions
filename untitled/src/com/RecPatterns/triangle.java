package com.RecPatterns;

public class triangle {
    public static void main(String[] args) {
        int n =4;

        print2(4,0);
    }
    static void print(int r, int c){

        if( r==0 ){
            return;
        }
        if (c < r) {
            System.out.print("*" + " ");
            print(r, ++c);

        }else{
            System.out.println();
            print(--r, 0);
        }

    }
    static void print2(int r, int c){

        if( r==0 ){
            return;
        }
        if (c < r) {

            print2(r, ++c);
            System.out.print("*" + " ");
        }else{
            print2(--r, 0);
            System.out.println();
        }

    }
}