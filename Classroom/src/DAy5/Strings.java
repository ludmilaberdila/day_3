package DAy5;

public class Strings {
    public static void main(String[] args) {
        String literalString = "literalString";  ///this string is stored in String pool
        String literalString2 = "literalString";
        System.out.println (literalString == literalString2);
        // 2nd - new object of String
        String someString = new String("literalString");
        System.out.println (literalString == literalString);
        System.out.println (literalString.equals (literalString2));


    }
}
