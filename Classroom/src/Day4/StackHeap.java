package Day4;

public class StackHeap {
    int instanceVariable; //in Heap memory

    public static void main(String[] args) {
        int localVariable; //in Stack memory
        String string1 = "Cat"; //in Heap memory
        String string2 = "Cat";
        String string3 = new String ( "Cat" );

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string1==string3);
        System.out.println(string1.equals(string3));
        System.out.println();



    }
}
