package Day33.Person;

public class Teacher extends person {
    String subject;
    int experience;

    public Teacher(String subject, int age, int experience, String address, String name){
        super(name, age, address);

    }

    public void teach(){
        System.out.println(name + "teachers" + subject);
    }
    public void createAssignment(){
        System.out.println(name + "creates a new assignment");
    }


}
