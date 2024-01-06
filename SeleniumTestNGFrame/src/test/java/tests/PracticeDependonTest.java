package tests;

import org.testng.annotations.Test;

public class PracticeDependonTest {

    @Test
    public void wakeup(){

    }
    @Test (dependsOnMethods = "brushTeeth")
    public void driveToCity(){

    }
    @Test (dependsOnMethods = "wakeup")
    public void eat(){

    }
    @Test (dependsOnMethods = "eat")
    public void brushTeeth(){

    }

    @Test
    public void eatDinner(){

    }
    @Test
    public void driveHome(){

    }

}
