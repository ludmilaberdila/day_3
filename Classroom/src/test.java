public class test {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (str1.equals( str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}