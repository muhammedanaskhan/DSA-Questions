package com.HashMap;

import java.util.HashMap;
import java.util.Set;

public class implementation {
    public static void main(String[] args) {
        HashMap<String, Integer> hp = new HashMap<>();
        hp.put("India",135);
        hp.put("Chine",200);
        hp.put("Pak",30);
        hp.put("US",20);
        hp.put("UK",10);

        System.out.println(hp);

        System.out.println(hp.get("Pak"));

        System.out.println(hp.containsKey("Brazil"));

        Set<String> keys = hp.keySet();
        System.out.println(keys);
    }
}
