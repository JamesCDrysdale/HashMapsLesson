package org.example;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, Integer> petSupplies = new HashMap<>();

        petSupplies.put("Chicken Kibbles", 1);
        petSupplies.put("Tennis Balls", 6);

        System.out.println(petSupplies.get("Tennis Balls"));
    }
}
