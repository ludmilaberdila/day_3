package unitTests;

import org.junit.*;

public class PracticeUnitTest {
    /*
    if score >= 90, return 5
    if score < 90 and score >= 70, return 4
    if score < 70 and score >= 50, return 3
    else
    return 0
     */


    public int gradeStudent(int score){
        if(score>=90){
            return  5;
        } else if (score < 90 && score >= 70) {
            return 4;
        } else if (score < 70 && score >= 50) {
            return 3;
        }else {
            return 0;
        }
    }

    @Test
    public void test1(){
        System.out.println("test 1");

        Assert.assertEquals(5, gradeStudent(101));
    }
    @Test
    public void test2(){
        System.out.println(" test 2");

        Assert.assertEquals(5,gradeStudent(90));
    }
    @Test
    public void test3(){
        System.out.println(" test 3 ");

        Assert.assertEquals(5,gradeStudent (92));
    }
    @Test
    public void test4(){
        System.out.println(" test 4");

        Assert.assertEquals(4,gradeStudent(70));
    }
    @Test
    public void test5(){
        System.out.println(" test 5");

        Assert.assertEquals(5, gradeStudent(98));
    }
    @Test
    public void test6(){
        System.out.println(" test 6");

        Assert.assertEquals(3, gradeStudent(65));
    }
    @Test
    public void test7(){
        System.out.println(" test 7");

        Assert.assertEquals(3,gradeStudent(68));
    }
    @Test
    public void test8() {
        System.out.println(" test 8");

        Assert.assertEquals(3, gradeStudent(50));
    }
    @Test
    public void test9(){
        System.out.println(" test 9");

        Assert.assertEquals(3,gradeStudent(55));
    }
    @Ignore
    public void test10(){
        System.out.println(" test 10");

        Assert.assertEquals(0,gradeStudent(10));
    }

    @Before
    public void beforeTest(){
        System.out.println("this is before test");
    }

    @After
    public void afterTheTest(){
        System.out.println("after test");
    }

    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("this is before class");
    }
    @AfterClass
    public static void afterClassMethod(){
        System.out.println("this is after class");
    }

    @Ignore
    public static void ignoringmethod(){
        System.out.println("check message");

    }

}
