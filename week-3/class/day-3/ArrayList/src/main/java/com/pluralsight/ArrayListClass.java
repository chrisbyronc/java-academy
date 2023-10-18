package com.pluralsight;
import java.util.*;

public class ArrayListClass {

    public static void main(String[] args) {
        ArrayList<String> sesameStreetCharacters = new ArrayList<String>();

        sesameStreetCharacters.add("Big Bird");
        sesameStreetCharacters.add("Cookie Monster");
        sesameStreetCharacters.add("Elmo");
        sesameStreetCharacters.add("Snuffleupagus");
        sesameStreetCharacters.add("Bert");
        sesameStreetCharacters.add("Ernie");
        sesameStreetCharacters.add("Oscar");

        sesameStreetCharacters.set(6, "Oscar the Grouch");


        sesameStreetCharacters.remove(3);

        Collections.sort(sesameStreetCharacters);

        System.out.println(sesameStreetCharacters.get(3));

    }
}
