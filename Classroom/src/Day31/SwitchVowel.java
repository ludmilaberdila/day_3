package Day31;

public class SwitchVowel {
    public static void main(String[] args) {
        char letter = 'A';
        switch (letter) {
            case 'A', 'E', 'U', 'I', 'O' -> System.out.println("vowel");
            default -> System.out.println("consonant");
        }
    }
}
