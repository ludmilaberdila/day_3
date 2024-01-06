package Day34;

public class Employee {
    String name;
    String gender;
    int salary;
    public Employee(String name, String gender, int salary){
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }
    public  void employeeMethod(){
        System.out.println("Employee");
    }
    public void department(){
        System.out.println(name + gender + salary);

    }

    }

