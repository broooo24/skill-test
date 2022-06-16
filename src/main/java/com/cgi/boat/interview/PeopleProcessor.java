package com.cgi.boat.interview;
import java.util.*;
import java.util.stream.Collectors;

public class PeopleProcessor {
   static Map<String, List<String>> lastnamesByFirstname(List<Person> people){
        //TODO: implement
        var peopleStream = people.stream()
                .collect(groupingBy(Person::getFirstName,
                        Collectors.mapping(Person::getLastName, Collectors.toList())));

        return peopleStream;
    }


    static Map<String, List<String>> firstnamesByLastname(List<Person> people){
        var peopleStream = people.stream()
                .collect(groupingBy(Person::getLastName,
                        Collectors.mapping(Person::getFirstName, Collectors.toList())));
        return peopleStream;
    }
}
