package com.shubham.testing.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IndexControllerTest {

    IndexController indexController;
    @BeforeEach
    void setUp() {
        indexController=new IndexController();
    }

    @Test
    void testIndex(){
        assertEquals("index",indexController.index());
        assertEquals("index",indexController.index(),"Wrong view returned");
    }

    @Test
    void testOopsHandler(){
        assertTrue("notimplemented".equals(indexController.oopsHandler()),()->"this is expensive call");
    }

    @Test
    @DisplayName("Test exception")
    void oopsHandler() {
        assertThrows(ValueNotFoundException.class, () -> {
            indexController.oopsHandlerException();
        });
    }
}