package Day38;

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
       fizzBuzz(30);
    }
    public  static  void fizzBuzz(int n){
        ArrayList<String> strings = new ArrayList<>();
        for (int i =1; i <= n; i++ ){
            if(i % 3 == 0 && i % 5 == 0){
                strings.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                strings.add("Fizz");
            }
            else if (i % 5 ==0) {
                strings.add("Buzz");
            }
            else {
                strings.add(String.valueOf(i));
            }
        }
        System.out.println(strings);
    }
}
