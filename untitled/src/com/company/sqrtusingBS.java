package com.company;
// FOR PERFECT SQUARE ROOT NUMBERS

public class sqrtusingBS {
    public static void main(String[] args) {

        int n = 2500;
        int start = 0;
        int end = n;
        int sqrt = 0;

        boolean found = false;

        while (!found) {

            int mid = (start + end) / 2;

            if (mid * mid == n) {
                sqrt = mid;
                found=true;
            } else if (mid * mid > n) {
                end = mid-1;
            } else {
                start = mid+1;
            }

        }
        System.out.println(sqrt);
    }
}
