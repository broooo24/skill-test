package com.cgi.boat.interview;

import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, Long> firstByLast = PeopleProcessor.firstnamesByLastname(PeopleSetup.people,3);
        Map<String, Long> lastByFirst = PeopleProcessor.lastnamesByFirstName(PeopleSetup.people,3);
        System.out.println(firstByLast);
        System.out.println(lastByFirst);
    }
}
