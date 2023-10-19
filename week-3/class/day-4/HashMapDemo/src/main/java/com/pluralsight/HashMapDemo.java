package com.pluralsight;
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> statesAndCapitals = new HashMap<String, String>();

        statesAndCapitals.put("CT", "Hartford");
        statesAndCapitals.put("NC", "Raleigh");
        statesAndCapitals.put("NJ", "Trenton");
        statesAndCapitals.put("SC", "Columbia");
        statesAndCapitals.put("TN", "Nashville");
        statesAndCapitals.put("NY", "Albany");

        statesAndCapitals.remove("TN");

        statesAndCapitals.put("TN", "Nashville");
        statesAndCapitals.putIfAbsent("TN", "Memphis");

        for (String value : statesAndCapitals.values()) {
            System.out.println(value);
        }

        for (String key : statesAndCapitals.keySet()) {
            System.out.println(key + " and value: " + statesAndCapitals.get(key));
        }

    }
}
