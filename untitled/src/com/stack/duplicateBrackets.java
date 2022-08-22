package com.stack;

import java.util.Stack;

public class duplicateBrackets {
    public static void main(String[] args) {
        String a= "((a+b)+(c+d))";  // non-duplicate array
        String b= "(a+b)+((c+d))";  // duplicate array

        System.out.println(checkdup(a));
        System.out.println(checkdup(b));
    }
    public static boolean checkdup(String str){
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if(ch == ')'){
                if(stack.peek()=='('){
                    return true;
                }
                else{
                    while(stack.peek()!='('){
                        stack.pop();
                    }stack.pop();
                }
            }else{
                stack.push(ch);
            }
        }return false;
    }
}