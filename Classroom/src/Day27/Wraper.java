package Day27;

public class Wraper {
    public static void main(String[] args) {
//        Integer number1 = new Integer(55);  //old you cant used
//        Integer number2 = new Integer("55");
        // Autoboxin  mean convert
        Integer number1 = 55; // autoboxes by jvm
        Integer number2 = Integer.valueOf("55"); //hardcoded conversion

        Float number3 = 55f; // autoboxes by jvm
        Float number4 = Float.valueOf("55.Of"); //hardcoded

        Character char1 = 'f'; //autoboxes by jvm
        Character char2 = Character.valueOf('f'); //hardcoded conversion

        //Boolean, Long, Short, Byte, Double


    }
}
