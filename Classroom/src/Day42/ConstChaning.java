package Day42;

public class ConstChaning {

    public ConstChaning(){
        this(5);
        System.out.println("empty const");

    }
    public ConstChaning(int parameters){
        System.out.println("const. with parameters");
    }

    public static void main(String[] args) {
        ConstChaning constChaning = new ConstChaning();

    }
}
