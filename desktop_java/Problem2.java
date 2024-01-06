public class Problem2 {
    private String age = "";  //instance variable or global variable
    private String firstName = "";
    private String lastName = "";

    public void setFirsLastName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void fullDetails(){
        System.out.println("hi " + this.firstName + " " +this.lastName + " you was born on: " + this.age);
    }


    public void setAge(String ag){
        this.age = ag;
    }
    public void displayAge(){
        System.out.println("your age is: " + this.age);
    }
    public static void birthday(int day, int month, int year){
        System.out.println(day + "/" + month+ "/" + year);
    }
}
