package Day40;

public class Lion extends Animal {
    int year = number;

    String str1 = super.getName();
    String str2 = getName();
    String str3 = this.str1;

    public String getName(){
        return  "Lion";
    }
    public  void  setStr1(String str1){
        this.str1 = str1;
    }
    public static void main(String[]args){
        Lion lion = new Lion();
        System.out.println(lion.year);
        System.out.println(lion.str1);
        System.out.println(lion.str2);
        System.out.println(lion.str3);
    }
}
