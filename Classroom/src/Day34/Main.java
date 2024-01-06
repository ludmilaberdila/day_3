package Day34;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John", "M", 8000, "Sales");
        Engineer engineer = new Engineer("Lisa", "F", 9500, "Java");
  Accounter accounter = new Accounter("Jon", "M", 6500);

ArrayList<Employee> employees = new ArrayList<>(List.of(manager, engineer));
        System.out.println(employees.get(0)instanceof Manager);

        for (Employee employee : employees) {
            System.out.println(employee.name + employee.gender + employee.salary);

            if (employee instanceof Manager) {
                System.out.println(((Manager)employee).department);
            }
            else if( employee instanceof Engineer) {
                System.out.println(((Engineer)employee).mainProgramingLanguage);
            }
            System.out.println();
        }
    }
}
