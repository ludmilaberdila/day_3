package DAy5;

public class CompoundOperation {
    public static void main(String[] args) {
        int intVariable = 15;
        int result = intVariable * intVariable + intVariable;
        result+=result; // 480
        System.out.println(result);
        result-=125;
        System.out.println(result);
        result*=100;
        System.out.println(result);
        result/=50;
        System.out.println(result);
        result%=1;
        System.out.println(result);
    }
}
