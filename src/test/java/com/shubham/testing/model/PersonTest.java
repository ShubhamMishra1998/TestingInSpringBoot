package com.shubham.testing.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {
        Person person=new Person(1L,"shubham","mishra");
        assertAll("Test Props set",
                ()->assertEquals("shubham",person.getFirstName()),
                ()->assertEquals("mishra",person.getLastName()));
    }
}