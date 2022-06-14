package com.cgi.boat.interview;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> firstByLast = PeopleProcessor.firstnamesByLastname(PeopleSetup.people);
        Map<String, List<String>> lastByFirst = PeopleProcessor.lastnamesByFirstName(PeopleSetup.people);
        get3Longest(firstByLast);


    }

    public static void get3Longest(Map<String, List<String>> map) {
        int firstLength = 0;
        int secondLength = 0;
        int thirdLength = 0;

        List<String > firstArray = new ArrayList<>();
        List<String > secondArray = new ArrayList<>();
        List<String > thirdArray = new ArrayList<>();

        String first = "";
        String second = "";
        String third = "";

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            int currentLength = entry.getValue().size();
            if (currentLength > firstLength) {
                firstLength = currentLength;
                first = entry.getKey();
                firstArray = entry.getValue();
            } else if (currentLength > secondLength) {
                secondLength = currentLength;
                second = entry.getKey();
                secondArray = entry.getValue();
            } else if (currentLength > thirdLength) {
                thirdLength = currentLength;
                third = entry.getKey();
                thirdArray = entry.getValue();
            }
            //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().size());
        }

        System.out.println(first+ ": " + firstArray.size());
        System.out.println(second+ ": " + secondArray.size());
        System.out.println(third+ ": " + thirdArray.size());
    }
}
