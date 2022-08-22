package com.Recursion;

// print numbers from N to 1 in reverse
public class Nto1 {
    public static void main(String[] args) {
        int n=5;
        prnt(n);                //print 5 to 1
//        System.out.println();
//        prntRev(n);             //print 1 to 5
//        System.out.println();
//        prntBoth(n);            //print 5 to 1 and 1 to 5
    }

    static void prnt(int n){

        if(n==0){
            return;
        }
        System.out.print(n + " ");
        prnt(n-1);

    }

    static void prntRev(int n){

        if(n==0){
            return;
        }
        prntRev(n-1);
        System.out.print(n + " ");

    }

    static void prntBoth(int n){

        if(n==0){
            return;
        }
        System.out.print(n + " ");
        prntBoth(n-1);
        System.out.print(n + " ");

    }
}


