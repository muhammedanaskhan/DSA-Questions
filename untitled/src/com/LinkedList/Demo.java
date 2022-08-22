package com.LinkedList;

import java.util.LinkedList;

public class Demo {

    public static class Node{           //Node object
        int data;
        Node next;
    }

    public static class linkedlist{           //linkedlist summary
        Node head;
        Node tail;
        int size;

        void addLast(int val){
            Node temp = new Node();
            temp.data=val;
            temp.next=null;

            if(size==0){
                head = tail = temp;
                size++;
            }else{
                tail.next=temp; // purani tail ka next ye node daldo
                tail=temp;      // ye node ko tail banado // update tail to this new node
                size++;
            }
        }

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void removeFirst(){
            head=head.next;
            size--;
        }

        public int getFirst(){
            return head.data;
        }
        public int getLast(){
            return tail.data;
        }

        public int getAt(int index){
            Node temp = head;
            for(int i = 0 ; i < index ; i++){
                temp=temp.next;
            }return temp.data;
        }

        public void addFirst(int data){
            Node newnode = new Node();
            newnode.next=head;
            head=newnode;
            size++;
        }

        public void addAt(int index, int val){
            Node nn=new Node();
            nn.data=val;
            Node temp = head;
            for(int i= 0 ; i<index-1; i++){
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next=nn;
            size++;
        }

        public void removeLast(){
            Node temp = head;
            for(int i = 0 ; i < size-2; i++ ){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;
        }

        private Node getNodeAt(int index){
            Node temp = head;
            for(int i = 0 ; i < index ; i++){
                temp=temp.next;
            }return temp;
        }
        public void reverseDI(){
            int l = 0;
            int h = size-1;
            while(l<h){
                Node left = getNodeAt(l);
                Node right = getNodeAt(h);

                int temp = right.data;
                right.data = left.data;
                left.data=temp;

                l++;
                h--;
            }
        }

        public void reversePI(){
            Node prev=null;
            Node curr=head;

            while(curr!=null){
                Node next = curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;

            }

            Node temp=head;
            head=tail;
            tail=temp;

        }

    }
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.display();
        System.out.println(list.size);

//        list.removeFirst();
//        list.display();
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//        System.out.println(list.getAt(2));
//        list.addFirst(00);
//        list.display();
//        System.out.println(list.size);

//        list.addAt(2,786);
//        list.display();

//        list.removeLast();
//        list.display();

//        list.reverseDI();
//        list.display();

//        list.reversePI();
//        list.display();

    }
}