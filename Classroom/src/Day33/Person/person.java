package Day33.Person;

public class person {
    String name;
    int age;
    String address;

   public person(String name, int age, String address){
       this.name = name;
       this.age = age;
       this.address = address;
   }
    public void sleep(){
        System.out.println("sleep");
    }
    public void eat(){
        System.out.println("eat");
    }
}
