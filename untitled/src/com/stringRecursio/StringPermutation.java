package com.stringRecursio;

import java.util.ArrayList;

public class StringPermutation {
    public static void main(String[] args){

        perm("", "abc");

        ArrayList<String> ans = permArr("", "abc");
        System.out.println(ans);
    }

    static void perm(String p, String up){

        if(up.length()==0){
            System.out.println(p);
        }
        for( int i = 0 ; i < up.length() ; i++){

            char ch = up.charAt(i);

            String l =  up.substring(0,i);
            String r = up.substring(i+1);
            String nextup = l+r;
            perm(p+ch, nextup);

        }
    }
    static ArrayList<String> permArr(String p, String up){

        if(up.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        for( int i = 0 ; i < up.length() ; i++){

            char ch = up.charAt(i);

            String l =  up.substring(0,i);
            String r = up.substring(i+1);
            String nextup = l+r;
            ans.addAll(permArr(p+ch, nextup));
        }
        return ans;
    }
}


