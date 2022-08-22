package com.stringRecursio;

import java.util.ArrayList;
import java.util.List;

public class subSeq {
    public static void main(String[] args) {

        ArrayList<String> List = new ArrayList<>();
        seqret("","abc", List);
        System.out.println(List);

        System.out.println(seqret2("","abc"));
    }
    static void seq( String p, String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        seq(p+ch, up.substring(1));
        seq(p,up.substring(1));
    }

    // Passing ArrayList in argument

    static ArrayList<String> seqret(String p, String up, ArrayList List){
        if(up.length()==0){

            List.add(p);
            return List;
        }
        char ch = up.charAt(0);
        seqret(p+ch, up.substring(1), List);
        seqret(p,up.substring(1), List);

        return List;
    }

    // Creating Arraylist in function body itself

    static ArrayList<String> seqret2(String p, String up){
        if(up.length()==0){

            ArrayList<String> List = new ArrayList<>();
            List.add(p);
            return List;

        }
        char ch = up.charAt(0);
        ArrayList<String> left = seqret2(p+ch, up.substring(1));
        ArrayList<String> right = seqret2(p,up.substring(1));

        left.addAll(right);

        return left;
    }
}
