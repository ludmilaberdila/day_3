package Day34;

public class Manager extends Employee{
    String department;
    public Manager(String name, String gender, int salary, String department){
        super(name,gender, salary);
        this.department = department;

    }
    public  void manegerManager(){
        System.out.println("Manager");
    }
}
