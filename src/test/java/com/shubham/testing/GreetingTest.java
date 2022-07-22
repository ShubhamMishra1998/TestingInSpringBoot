package com.shubham.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GreetingTest {
   private Greeting greeting;

   @BeforeAll
   public static void beforeClass(){
       System.out.println("Before all executed only once");
   }

    @BeforeEach
    void setUp(){
      greeting=new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());

    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("John"));
    }
}
