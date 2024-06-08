package com.codingChallenge;

import java.util.*;

public class Task5 {

    public static void main(String[] args) {
        String [] input = {"akka", "akak", "baab", "baba", "bbaa"};

        Map<String, List<String>> anagramsMap = anagramBuckets(input);
        System.out.println("anagramsMap = " + anagramsMap);
    }

    private static Map<String, List<String>> anagramBuckets(String [] strs){
        HashMap<String, List<String>> anagramsMap = new HashMap<>(); //using a map data structure defining the type which is a string as key
        for(String str : strs){ //traversing an array of string
            char [] arr = str.toCharArray(); //convert to an array
            Arrays.sort(arr); //sort array
            String key = String.valueOf(arr); // convert back to string
            if (!anagramsMap.containsKey(key)) {
                anagramsMap.put(key, new ArrayList<>());
            }
            anagramsMap.get(key).add(str);
        }
         return anagramsMap;

    }
}

