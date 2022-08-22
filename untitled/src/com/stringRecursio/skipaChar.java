package com.stringRecursio;

public class skipaChar {
    public static void main(String[] args) {
        String str = "acaabbbaccb";
        skip("",str);
    }

    static void skip( String p, String up ){

        if(up.length() == 0){
            System.out.println(p);
            return;
        }

        if( up.charAt(0) == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p + up.charAt(0) , up.substring(1));
        }
    }
}
























































































