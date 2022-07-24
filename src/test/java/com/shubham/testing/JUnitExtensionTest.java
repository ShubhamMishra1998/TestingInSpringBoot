package com.shubham.testing;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class JUnitExtensionTest {
    @Mock
    Map<String,String> map;
    @Test
    void testAnnotation(){
        map.put("abc","def");

    }
}
