package com.cgi.boat.interview;

import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> firstByLast = PeopleProcessor.firstnamesByLastname(PeopleSetup.people);
        Map<String, List<String>> lastByFirst = PeopleProcessor.lastnamesByFirstname(PeopleSetup.people);

        List<Map.Entry<String, Integer>> topThree =
                lastByFirst.entrySet().stream()
                        .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, e -> e.getValue().size()))
                        .entrySet()
                        .stream()
                        .sorted(Comparator.<Map.Entry<String, Integer>, Integer>comparing(Map.Entry::getValue).reversed())
                        .limit(3)
                        .collect(Collectors.toList());
        System.out.println(topThree);
    }
}
