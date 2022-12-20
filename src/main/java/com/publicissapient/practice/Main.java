package com.publicissapient.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> uniquePersonList = removeDuplicates();
        uniquePersonList.forEach(System.out::println);
    }

    public static List<Person> removeDuplicates() {

        List<Person> personList = new ArrayList<>(
                Arrays.asList(
                        new Person("Amit", 21, "London"),
                        new Person("Cynthia", 28, "Belfast"),
                        new Person("Wendy", 26, "Manchester"),
                        new Person("Gareth", 21, "Cardiff"),
                        new Person("Charles", 29, "Edinburgh"),
                        new Person("Wendy", 26, "Edinburgh"),
                        new Person("Gareth", 21, "Edinburgh"),
                        new Person("Charles", 29, "Cardiff")
                )
        );

        Set<String> nameAndAge = new HashSet<>();

        return personList.stream()
                .filter(e -> nameAndAge.add(e.getName() + e.getAge()))
                .collect(Collectors.toList());
    }
}
