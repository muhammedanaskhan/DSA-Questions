package com.PriorityQueue;

import java.util.PriorityQueue;

public class Demo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] ranks = {2, 11, 15, 10, 1};

        for(int val : ranks){
            pq.add(val);
        }

        while (pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
