package com.stringRecursio;

import java.util.ArrayList;

public class ascii {
    public static void main(String[] args) {

        System.out.println(asciiret("", "abc"));
    }
     static void seq( String p , String up){
         if(up.length()==0){
             System.out.println(p);
             return;
         }
         char ch = up.charAt(0);
         seq(p+ch, up.substring(1));
         seq(p,up.substring(1));
         seq(p + (ch + 0), up.substring(1));
     }

    static ArrayList<String> asciiret(String p, String up){
        if(up.length()==0){

            ArrayList<String> List = new ArrayList<>();
            List.add(p);
            return List;

        }
        char ch = up.charAt(0);
        ArrayList<String> first = asciiret(p+ch, up.substring(1));
        ArrayList<String> second = asciiret(p,up.substring(1));
        ArrayList<String> third = asciiret(p + (ch+0) ,up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
