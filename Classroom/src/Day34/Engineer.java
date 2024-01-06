package Day34;

public class Engineer extends  Employee {
    String mainProgramingLanguage;
    public Engineer(String name, String gender, int salary, String mainProgramingLanguage) {
        super(name, gender, salary);
        this.mainProgramingLanguage = mainProgramingLanguage;
    }

    public void engineerEngineer(){
        System.out.println("Engineer");
    }
}
