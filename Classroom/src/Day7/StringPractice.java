package Day7;

public class StringPractice {
    public static void main(String[] args) {
         String stringVariable = "Good enining Batch4!";
        int year = 2023;
        // String non primitive data type, is a class
        //string is imutable

        System.out.println(stringVariable.length());
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello Batch4!";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(stringVariable.toLowerCase());
        System.out.println(stringVariable.toUpperCase());
        System.out.println(stringVariable.charAt(18));
       System.out.println(stringVariable.charAt(3));
       int numberofLetters = stringVariable.length(); //19
        System.out.println(stringVariable.charAt(19));
       // System.out.println(stringVariable.charAt(numberofLetters()-1));

      /* System.out.println(str1.indexOf("e"));
        System.out.println(str1.indexOf("l"));
        System.out.println(str1.indexOf("o"));
        System.out.println(str3.indexOf("Batch4"));  */

       // System.out.println(str2.isEmpty());
       // System.out.println(str1.replace("Hello", "Mom")); // replace the letter or the whole word
      //  System.out.println(str1.startsWith("Hello"));
      //  System.out.println(str1.endsWith("lo")); //last letter
      //  System.out.println(str1.trim()); // remuve space
       /* System.out.println(str1.substring(2)); //cut your string
        System.out.println(str1.substring(1));
        System.out.println(str1.substring(2,4));
        System.out.println(stringVariable.substring(7,15));
        System.out.println(str1.contains("w"));  */

    }
}
