package com.learn.test.services;

/*
* Testing the method use @Test
* Testing method but under given time use @Test(timeout = 2000) , 1000 = 1 second
* Execute Before use @BeforeClass
* Execute Before each use @Before
* Execute after use @AfterClass
 */

import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {

    int counter = 0;

//    @BeforeClass
    @BeforeClass //execute before all test cases
    public static void init(){
        System.out.println("Before all test cases");
        System.out.println("Started test: " + new Date());

//        Connection open | file open

    }

    @Before  //execute the method before each test case
    public void beforeEach(){
        System.out.println("Before each test case");
        counter = 0;
    }

    @Test
    public void addTwoNumbersTest(){

        for (int i = 0; i <= 20; i++){
            counter += i;
        }

        System.out.println("test for addTwoNumbersTest");

        //        actual result
        int result = CalculatorService.addTwoNumbers(4, 7);

        //        expected result
        int expected = 11;

        System.out.println("Counter first test case : " + counter);

//        check the expected or actual result match or not
        Assert.assertEquals(expected, result);

    }

    @Test(timeout = 2000)
    public void sumAnyNumbersTest() throws InterruptedException {
        for (int i = 0; i <= 100; i++){
            counter += i;
        }

        Thread.sleep(3000);

        System.out.println("test for sumAnyNumbersTest");
        int result = CalculatorService.sumAnyNumbers(2, 3, 5);
        int expectedResult = 10;

        System.out.println("Counter second test case : " + counter);

        Assert.assertEquals(expectedResult, result);

    }

    @AfterClass  //after all test cases
    public static void cleanup(){
        System.out.println("After all test cases");
        System.out.println("End test cases: " + new Date());

        //        Connection closes | file close

    }
}
