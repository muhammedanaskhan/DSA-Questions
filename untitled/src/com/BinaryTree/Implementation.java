package com.BinaryTree;

import java.util.Stack;

public class Implementation {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node( int data, Node left, Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }


    }
    public static class Pair{
        Node node;
        int state;

        Pair(Node node, int state){
            this.node=node;
            this.state=state;
        }
    }

    public static void main(String[] args) {
        Integer[] arr= {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, 70, null, null, 87, null, null};
        Node root= new Node(arr[0],null, null);
        Pair rootpair = new Pair(root,1);

        Stack<Pair> st = new Stack<>();
        st.push(rootpair);

        for(int i = 1 ; i < arr.length ; i++){
            Pair top = st.peek();
            if(top.state == 1){        //if Top Pair's state is '1' means Left lagana Hai!!
                if(arr[i]!=null){
                    Node ln= new Node(arr[i],null,null);
                    top.node.left=ln;

                    Pair lp = new Pair(ln,1);
                    st.push(lp);
                }else{
                    top.node.left=null;
                }
                top.state++;    // Left lag gya ab state badha do!!

            }else if(top.state == 2){ //if Top Pair's state is '2' means Right lagana Hai!!
                if(arr[i]!=null){
                    Node rn= new Node(arr[i],null,null);
                    top.node.right=rn;

                    Pair rp = new Pair(rn,1);
                    st.push(rp);
                }else{
                    top.node.right=null;
                }
                top.state++;     // Right lag gya ab state badha do!!
            }else if(top.state == 3){
                st.pop();
            }


        }

    }
}
