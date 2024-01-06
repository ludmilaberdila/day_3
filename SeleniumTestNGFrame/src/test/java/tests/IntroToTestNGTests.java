package tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class IntroToTestNGTests {
    @BeforeClass
    public static void before(){
        System.out.println("this is BEFORE CLASS");
    }

    @AfterClass
    public static void after(){
        System.out.println("this is AFTER CLASS");
    }


    @BeforeMethod
    public void beforeEveryMethod(){
        System.out.println("this is before method");
    }

    @AfterMethod
    public void afterEveryMethod(){
        System.out.println("after every method");
    }


    @Test
    public void test1(){
        System.out.println("INTRO TO TESTNG this is test 1");
        Assert.assertEquals(4,5 - 1);
    }

    @Test
    public void test2(){
        System.out.println("INTRO TO TESTNG this is test 2");
        Assert.assertNull(null);
    }
}
