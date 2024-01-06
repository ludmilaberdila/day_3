package Problem;

public class polindrom {
    public static void main(String[] args) {
        String str = "level";
                String reverseStr = "";
        ;
        //how do you check where a string is a polindrom?

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        System.out.println(str.equals(reverseStr));

//        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
//            System.out.println(str + " is a Palindrome String.");
//        }
//        else {
//            System.out.println(str + " is not a Palindrome String.");
//        }
    }
}
