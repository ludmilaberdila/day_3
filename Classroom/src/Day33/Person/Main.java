package Day33.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Math",24,46, "Address1",
                "John");

        Teacher teacher2 = new Teacher("Physics",46,24, "Address2",
                "Mike");

        Student student1 = new Student("Lisa", 23, "Address3",
                11, "Math");

        ArrayList<person> people = new ArrayList<>();

        people.add(teacher1);
        people.add(teacher2);
        people.add(student1);



    }
}

