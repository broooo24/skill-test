package com.cgi.boat.interview;
import java.util.*;
import java.util.stream.Collectors;

public class PeopleProcessor {
    /*
    * Example:
            * For input: ["John Doe", "John Silver", "Peter Doe"]
            * Expected result would be:
            * {
     *  "John" -> ["Doe", "Silver"]
     *  "Peter" -> ["Doe"
     * }
     */
    static Map<String, Long> lastnamesByFirstName(List<Person> people,int limitNumber){
        Map<String, Long> result = people.stream()
                .collect(Collectors.groupingBy(Person::getFirstName,Collectors.counting()));
        Map<String,Long> finalMap = new LinkedHashMap<>();
        result.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .limit(limitNumber)
                .forEachOrdered(e->finalMap.put(e.getKey(),e.getValue()));

        return finalMap;
    }

    static Map<String, Long> firstnamesByLastname(List<Person> people,int limitNumber){
        Map<String, Long> result = people.stream()
                .collect(Collectors.groupingBy(Person::getLastName,Collectors.counting()));
        Map<String,Long> finalMap = new LinkedHashMap<>();
        result.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .limit(limitNumber)
                .forEachOrdered(e->finalMap.put(e.getKey(),e.getValue()));

        return finalMap;
    }
}
