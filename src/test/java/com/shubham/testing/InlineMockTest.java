package com.shubham.testing;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class InlineMockTest {

    @Test
    void testInlineMock(){
        Map mockMap=mock(Map.class);
        assertEquals(0,mockMap.size());

    }
}
