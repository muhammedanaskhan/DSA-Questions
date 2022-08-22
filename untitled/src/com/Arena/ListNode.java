package com.Arena;

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {

          ListNode l1 =  makeLL();
            //removeNthFromEnd(head, 2);
            printListNode(l1);
    }

    public static ListNode makeLL(){
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        head.next=head2;
        head2.next=head3;
        head3.next=head4;
        head5.next=head5;

        return head;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) { // if n=2
        ListNode temp = head;
        ListNode temp2 = head;

        int count=2;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }                           //count = 5
       // System.out.println(count);
        int k = count-n;            //k = 3
        count=1;
        while(true){
           // System.out.println();
            //System.out.print(count+"st Node"+" ");
            if(count==k){
                temp2.next=temp2.next.next;
                break;
            }
            //System.out.print(temp2.val);
            temp2=temp2.next;
            count++;
        }
        return head.next;
    }

    public static ListNode sol(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = head;
        head = dummy;

        ListNode temp  = head;

        int size = 0;
        while(head != null){
            head = head.next;
            size++;
        }

        int len = size;
        int i = 0;
        if(len <= 1){
            return null;
        }

        while( i < len - n-1){
            temp = temp.next;
            i += 1;
        }
        temp.next = temp.next.next;
        return head.next;

    }


    public static void printListNode(ListNode head){
          while(head.next!=null){
              System.out.print(head.val+" ");
              head=head.next;
          }
    }
  }

