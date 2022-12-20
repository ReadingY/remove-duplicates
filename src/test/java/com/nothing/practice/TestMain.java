package com.nothing.practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void testRemoveDuplicates() {
        List<Person> expected = new ArrayList<>(
                Arrays.asList(
                        new Person("Amit", 21, "London"),
                        new Person("Cynthia", 28, "Belfast"),
                        new Person("Wendy", 26, "Manchester"),
                        new Person("Gareth", 21, "Cardiff"),
                        new Person("Charles", 29, "Edinburgh")
                )
        );

        assertEquals(expected.toString(), Main.removeDuplicates().toString());
    }
}
