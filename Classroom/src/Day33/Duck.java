package Day33;

public class Duck extends Animal{


    public Duck (String name, int age ){
        super(name, age);
        System.out.println("constructor of duck class");
    }
    public void fly(){

        System.out.println("Duck is flying ");
    }

}
