package Problem;

import java.util.LinkedHashSet;

public class Duplicate {
    public static void main(String[] args) {
        //write a program where you are giving a string str = "goodmorningevening
       // remove the repeat letter from string, and print string without duplicate letter


        String str = "goodmorningevening";

//        for (int i = 0; i < str.length();i++){    // first way to solve problem
//            char c = str.charAt(i);
//            if(str.indexOf(c)==i){
//                System.out.print(c +"");
//            }
//        }


        String updateVer = "";        // second way to solve problem
        LinkedHashSet<Character>chars = new LinkedHashSet<>();;
        for(char i : str.toCharArray()) {
            chars.add(i);
        }
        for (char i : chars){
            updateVer += i;
        }
        System.out.println(updateVer);
    }
}
