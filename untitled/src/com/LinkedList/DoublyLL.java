package com.LinkedList;

public class DoublyLL {
    public static class Node{
        Node next;
        Node prev;
        int data;
    }

    public static class doublell{
        Node head;
        Node tail;
        int size;

        public void addFirst(int val) {

            Node newNode = new Node();
            newNode.data = val;
            size++;
            if (head == null) {
                head = tail = newNode;
                head.prev = null;
                tail.next = null;
            } else {
                head.prev = newNode;
                newNode.next = head;
                newNode.prev = null;
                head = newNode;
            }
        }

        public void addLast(int val){
            Node newNode = new Node();
            newNode.data=val;
            size++;
            if(head==null){
                head=tail=newNode;
                newNode.next=null;
                newNode.prev=null;
            }else{
                tail.next=newNode;
                newNode.next=null;
                newNode.prev=tail;
                tail=newNode;
            }
        }

        public void deleteAt(int index){
            Node temp=head;
            for(int i= 0; i<size; i++){
                if(index==0){
                    Node next = temp.next;

                    next.prev=null;
                    head=next;
                    size--;
                    break;
                }
                if(i==index-1){
                    Node ndel = temp.next;
                    Node nextNode = ndel.next;

                    nextNode.prev=temp;
                    temp.next=nextNode;
                    size--;
                    break;
                }
                    temp=temp.next;

            }
        }

        public void reverse(){

        }

        public void displayRev(){
            Node temp = tail;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.prev;
            }
            System.out.println();
        }
        public void displayFor(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

    }

    public static void main(String[] args) {
        doublell list = new doublell();

//        list.addFirst(10);
//        list.addFirst(20);
//        list.addFirst(30);
//        list.addFirst(40);
//        list.addFirst(50);
//        list.displayFor();
//        System.out.println();
//        list.displayRev();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.displayFor();
        System.out.println();
//        list.displayRev();
//
//        list.deleteAt(3);
//        list.displayFor();
        list.reverse();
        list.displayFor();
    }
}
