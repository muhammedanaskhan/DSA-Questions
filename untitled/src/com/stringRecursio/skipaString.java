package com.stringRecursio;

public class skipaString {
    public static void main(String[] args) {

        String str = "abcappleabc";
        System.out.println(skipApple(str));


    }

    static String skipApple( String up){

        if( up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }

    }
}


