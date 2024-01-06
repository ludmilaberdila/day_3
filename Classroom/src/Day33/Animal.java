package Day33;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age){

        this.name = name;
        this.age = age;
        System.out.println("constructor of animal class");
    }
    public  void sleep(){
        System.out.println("animal is sleeping");
    }

    public void eat (){
        System.out.println("animal is eating");
    }


}
