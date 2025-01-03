package com.learn.test.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJunit5 {


    @BeforeAll
    public static void init(){
        System.out.println("This is single time logic");
    }

    @AfterAll
    public static void cleanup(){
        System.out.println("After all test case logic ");
    }

    @BeforeEach
    public  void eachTestCase(){
        System.out.println("Before each test case");
    }


    @AfterEach
    public void afterEachTest(){
        System.out.println("After each test case");
    }

    @Test
    @DisplayName("This is custom name")  //if you want to change the name of test, use @displayName
    public void addTwoNumbersTest(){
        System.out.println("First test case");
        int result = CalculatorService.addTwoNumbers(12, 12);
        int expectedResult = 24;
        Assertions.assertEquals(expectedResult, result, "Test fail addTwoNumbersTest !");
    }

    @Test
    @Disabled  //Ignore the test
    public void sumAnyNumbersTest(){
        System.out.println("Second test case");
        int result = CalculatorService.sumAnyNumbers(1, 2, 3, 4);
        int expectedResult = 10;
        Assertions.assertEquals(expectedResult, result, "Test fail sumAnyNumbersTest !");
    }

//    some important Annotation, better understanding read document
//    @Tag()
//    @Nested
//    @TestFactory

}
