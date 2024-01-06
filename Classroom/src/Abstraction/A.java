package Abstraction;

public interface A {
    double Pi = 3.14;

    void abstarctMethod();

    default void defaultMethod(){
        System.out.println(" Default Method");

    }
}
