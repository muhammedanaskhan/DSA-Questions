package com.trees;

import java.util.ArrayList;
import java.util.Stack;

public class Display {

    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node){
        String str = node.data + " -> ";
        for(Node child : node.children){
            str += child.data +",";
        }
        System.out.println(str);

        for(Node child : node.children){
            display(child);
        }
    }

    public static int size(Node node){

        int s=0;

        for(Node child : node.children){
            int cs = size(child);
            s=s+cs;
        }
        s=s+1;
        return s;
    }

    public int max(Node node){

        int max=0;

        for(Node child: node.children){
            int cm = max(child);
            max= Math.max(cm,max);
        }

        max=Math.max(node.data, max);
        return max;
    }

    public int height(Node node){
        int h=-1;

        for(Node child : node.children){
            int ch=height(child);
            h=Math.max(ch,h);
        }
        h+=1;
        return h;
    }


    public static void main(String[] args) {
        int arr[] = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, 1, -1, -1 };
        Node root=null;
        Stack<Node> stack = new Stack();

        for( int i = 0 ; i < arr.length ; i++ ){
            if(arr[i] == -1){
                stack.pop();
            }else{
                Node t = new Node();
                t.data = arr[i];
                if(stack.size()>0) {
                    stack.peek().children.add(t);

                }else{
                    root=t;
                }
                stack.push(t);
            }
        }

        //display(root);
        System.out.println(size(root));
    }
}
