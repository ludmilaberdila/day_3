package unitTests;

import org.junit.Assert;
import org.junit.Test;

public class IntroToJunit {
//    public static void main (String[]args) {
//        reverseString("apple");
//        reverseString(null);
//        reverseString("hello");
//    }
        /*
         * write a method witch takes one String as parameter
         * and returns reversed string
         * */
        public static String reverseString (String word){
            if (word == null) {
                System.out.println("WORNING null was provided!");
                return null;
            }
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            System.out.println(reversed);
            return reversed;
        }
        @Test
        public void reverseTest1 () {
            reverseString("apple");

            Assert.assertEquals("elppa", reverseString("apple"));
        }
        @Test
        public void reverseString2 () {
            Assert.assertNull(reverseString(null));
        }
        @Test
        public void reverseString3 () {
            Assert.assertEquals("", reverseString(""));
        }
        @Test
        public void reverseTest4 () {
            Assert.assertTrue("98765".equals(reverseString("56789")));
        }





}
