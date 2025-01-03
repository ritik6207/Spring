package com.learn.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertEx {
    
//    Assertions - Validating an actual result with an expected result
//    Assertions - class

    @Test
    public void useTest(){
        System.out.println("Testing some assertion methods");
        float actual = 12;
        Float expected = 12.0f;
//        overloaded
        Assertions.assertEquals(expected, actual);

//        for array
        int[] actualIntArray = {1, 2, 3, 4};
        int[] expectedIntArray = {1, 2, 3, 4};
        Assertions.assertArrayEquals(expectedIntArray, actualIntArray);

//        for object
        String actualName = new String("ritik");
        String expectedName = new String("ritik");
        Assertions.assertEquals(expectedName, actualName);

//        for string
        String actualNames = "ritik";
        String expectedNames = "ritik";
        Assertions.assertSame(expectedNames, actualNames);

//        Assertions.assertNull();
//        Assertions.assertNotNull();

        boolean value = true;
        Assertions.assertTrue(value);

//        Assertions.assertFalse();

        List<Integer> list1 = Arrays.asList(1,2, 3, 4);
        List<Integer> list2 = Arrays.asList(1,2, 3, 4);
        Assertions.assertIterableEquals(list2, list1);


        Assertions.assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("This is testing exception");
        });

    }
    
    
}
